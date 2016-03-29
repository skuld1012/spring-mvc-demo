package me.tedzhang.demo.spring.service;

import java.util.List;

import me.tedzhang.demo.spring.dao.OffersDAO;
import me.tedzhang.demo.spring.model.Offer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("offersService")
public class OffersService {

	private OffersDAO offersDao;
	
	@Autowired
	public void setOffersDao(OffersDAO offersDao) {
		this.offersDao = offersDao;
	}

	public List<Offer> getCurrent() {
		
		return offersDao.getOffers();
	}

	public void createOffer(Offer offer) {
		offersDao.create(offer);
	}

	public void throwTestException() {
		offersDao.getOfferById(999);
	}
}
