package com.in28minutes.microservices.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.in28minutes.microservices.model.Exchangevalue;


@EnableJpaRepositories
public interface ExchangevalueRepository extends JpaRepository<Exchangevalue,Long>{

	Exchangevalue findByFromAndTo(String from,String to);
	
	
}
