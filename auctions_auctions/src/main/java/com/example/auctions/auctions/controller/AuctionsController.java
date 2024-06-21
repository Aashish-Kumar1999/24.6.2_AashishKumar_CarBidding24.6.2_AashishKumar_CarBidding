package com.example.auctions.auctions.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.auctions.auctions.entity.AuctionsEntity;
import com.example.auctions.auctions.service.AuctionsService;

@RestController
@CrossOrigin("*")
public class AuctionsController {

	@Autowired
	private AuctionsService auctionservice;

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();

	}

	@GetMapping("/getallauctions")
	public List<AuctionsEntity> getallauctions() {
		return auctionservice.getallauctions();
	}

	@PostMapping("/cars")
	public AuctionsEntity addauctions(@RequestBody AuctionsEntity auctions) {
		AuctionsEntity p = auctionservice.save(auctions);
		return p;
	}

	@DeleteMapping("/Users/{}")
	public void delete(@PathVariable("AuctionId") Long AuctionsId) {
		auctionservice.deleteauctions(AuctionsId);
	}

	@PutMapping("/users/{UserId}")
	public void updateauctions(@PathVariable("auctionsid") long AuctionsId, @RequestBody AuctionsEntity auctions) {
		auctionservice.updateauctions(AuctionsId, auctions);
	}

}
