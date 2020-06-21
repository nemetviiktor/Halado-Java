package com.java.chat.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.NumberFormat;

@Entity
@Table(name="messages")
public class Message {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="fromid")
	private int fromid;
	
	@NumberFormat
	@Column(name="toid")
	private int toid;
	
	@Size(min = 5)
	@Column(name="text")
	private String text;
	
	@Column(name="date")
	private String date;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFromid() {
		return fromid;
	}

	public void setFromid(int fromid) {
		this.fromid = fromid;
	}

	public int getToid() {
		return toid;
	}

	public void setToid(int toid) {
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

	public Message(int id, int fromid, int toid, String text, String date) {
		super();
		this.id = id;
		this.fromid = fromid;
		this.toid = toid;
		this.text = text;
		this.date = date;
	}

	public Message() {
		super();
	}
}
