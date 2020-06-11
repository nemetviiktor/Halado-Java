package com.java.chat.Controller;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.NumberFormat;

public class AddMessageDTO {
	
	@NumberFormat
	private Integer toid;
	
	@Size(min = 5)
	private String text;

	public AddMessageDTO(Integer toid, @Size(min = 5) String text) {
		super();
		this.toid = toid;
		this.text = text;
	}

	public AddMessageDTO() {
		super();
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Integer getToid() {
		return toid;
	}

	public void setToid(Integer toid) {
		this.toid = toid;
	}
}
