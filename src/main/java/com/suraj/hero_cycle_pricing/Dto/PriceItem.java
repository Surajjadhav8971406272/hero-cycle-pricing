package com.suraj.hero_cycle_pricing.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PriceItem {
	
	private String partName;

	    private Long price;

	    private int quantity;

	    private Long total;

}
