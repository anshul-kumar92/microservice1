package com.in28minutes.microservices.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Exchangevalue {
	
	
	@Id
	private Long id;
	
	
	@Column(name="currency_from")
	private String from;
	
	@Column(name="currency_to")
	private String to;
	private int conversionMultiple;
	private int port;
	
	public Exchangevalue()
	{
		
	}
	
	public Exchangevalue(Long id, String from, String to, int conversionMultuple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultuple;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public int getConversionMultuple() {
		return conversionMultiple;
	}
	public void setConversionMultuple(int conversionMultuple) {
		this.conversionMultiple = conversionMultuple;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
	

}
