package com.example.auctions.auctions.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuctionsEntity {
	
	private Long auctions_id;
	
	private long car_id;

	private String starttime;

	private String end_time;

	private String  higest_bid;
	
	private long    higest_bidder_id;
	
	private String status;
	
	}
