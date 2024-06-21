package com.example.auctions.auctions.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.auctions.auctions.entity.AuctionsEntity;
import com.example.auctions.auctions.reprository.AuctionsReprositorys;

@Service
public class AuctionsService {

	@Autowired
	public RestTemplate restTemplate;

	@Autowired
	public AuctionsReprositorys auctionsreprository;

	public AuctionsEntity save(AuctionsEntity auctions) {
		return auctionsreprository.save(auctions);
	}

	public void updateauctions(Long Auctions, AuctionsEntity auctions) {
		auctionsreprository.save(auctions);

	}

	public void deleteauctions(Long AuctionsId) {
		auctionsreprository.deleteById(AuctionsId);

	}

	public List<AuctionsEntity> getallauctions() {
		List<AuctionsEntity> list = (List<AuctionsEntity>) this.auctionsreprository.findAll();
		return list;
	}

}
