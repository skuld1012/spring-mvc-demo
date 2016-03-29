package me.tedzhang.demo.spring.controller;

import java.util.List;

import javax.validation.Valid;

import me.tedzhang.demo.spring.model.Offer;
import me.tedzhang.demo.spring.service.OffersService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OffersController {

	@Autowired
	private OffersService offersService;

	@RequestMapping("/offers")
	public String showOffers(Model model) {

		//offersService.throwTestException();
		
		List<Offer> offers = offersService.getCurrent();
		model.addAttribute("offers", offers);

		return "offers";
	}

	@RequestMapping("/createoffer")
	public String createOffer(Model model) {

		model.addAttribute("offer", new Offer());
		return "createoffer";
	}

	@RequestMapping(value = "/docreate", method = RequestMethod.POST)
	public String doCreate(Model model, @Valid Offer offer, BindingResult result) {

		if (result.hasErrors()) {
			
			return "createoffer";
		} 
		
		offersService.createOffer(offer);
		
		return "offercreated";
	}
}
