package me.tedzhang.demo.spring.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import me.tedzhang.demo.spring.validation.ValidEmail;

public class Offer {

	private int Id;
	
	@Size(min=5, max=100, message="Name must be between 50 and 100 characters.")
	private String name;
	
	@Size(min=20, max=255, message="Name must be between 20 and 255 characters.")
	private String text;
	
	@NotNull
	//@Pattern(regexp=".*\\@.*\\..*", message="This does not appear to be a valid email address.")
	@ValidEmail(min=6, message="This email is not valid.")
	private String email;
	
	public Offer(){}

	public Offer(String name, String text, String email) {
		this.name = name;
		this.text = text;
		this.email = email;
	}
	
	public Offer(int id, String name, String text, String email) {
		Id = id;
		this.name = name;
		this.text = text;
		this.email = email;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Offer [Id=" + Id + ", name=" + name + ", text=" + text + ", email=" + email + "]";
	}
}
