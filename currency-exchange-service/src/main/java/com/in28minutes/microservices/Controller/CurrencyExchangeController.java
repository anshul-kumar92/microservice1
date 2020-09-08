package com.in28minutes.microservices.Controller;

import java.math.BigDecimal;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microservices.Repo.ExchangevalueRepository;
import com.in28minutes.microservices.model.Exchangevalue;

@RestController
public class CurrencyExchangeController {
	
	//private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private ExchangevalueRepository repository;
	
	@Autowired
	private Environment environment; 
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public Exchangevalue retriveExchangeValue(@PathVariable String from,
			@PathVariable String to)
	{
		Exchangevalue exchangeValue= repository.findByFromAndTo(from,to);
		
		
		
		 exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		 
		 //logger.info("{}",exchangeValue);
		return exchangeValue;
	}

}
