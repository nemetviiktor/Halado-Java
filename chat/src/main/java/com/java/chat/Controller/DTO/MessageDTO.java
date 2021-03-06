package com.java.chat.Controller.DTO;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.NumberFormat;


public class MessageDTO {
	
	@NumberFormat
	private Integer toid;
	
	@Size(min = 5)
	private String text;
	
	private String date;

	public Integer getToid() {
		return toid;
	}

	public void setToid(Integer toid) {
		this.toid = toid;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public MessageDTO(Integer toid, @Size(min = 5) String text, String date) {
		super();
		this.toid = toid;
		this.text = text;
		this.date = date;
	}

	public MessageDTO() {
		super();
	}
}
