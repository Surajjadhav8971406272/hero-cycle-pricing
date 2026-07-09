
	package com.suraj.hero_cycle_pricing.service;

	import java.util.ArrayList;
	import java.util.List;

	import org.springframework.stereotype.Service;

import com.suraj.hero_cycle_pricing.Dto.PriceItem;
import com.suraj.hero_cycle_pricing.entity.Part;
	import com.suraj.hero_cycle_pricing.repository.PartRepository;

	import lombok.RequiredArgsConstructor;

	@Service
	@RequiredArgsConstructor
	public class PricingService {

	    private final PartRepository partRepository;

	    public List<PriceItem> calculatePrice(int[] quantity) {

	        List<Part> parts = partRepository.findAll();

	        List<PriceItem> result = new ArrayList<>();

	        for (int i = 0; i < parts.size(); i++) {

	            if (quantity[i] > 0) {

	                Part part = parts.get(i);

	                Long total = part.getPrice() * quantity[i];

	                result.add(
	                        new PriceItem(
	                                part.getName(),
	                                part.getPrice(),
	                                quantity[i],
	                                total));
	            }

	        }

	        return result;
	    }

	    public Long getGrandTotal(List<PriceItem> items) {

	        Long total = 0L;

	        for (PriceItem item : items) {

	            total += item.getTotal();

	        }

	        return total;
	    }

	}


