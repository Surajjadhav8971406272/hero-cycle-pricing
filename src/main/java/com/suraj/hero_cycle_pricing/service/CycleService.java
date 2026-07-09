package com.suraj.hero_cycle_pricing.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.suraj.hero_cycle_pricing.entity.Cycle;
import com.suraj.hero_cycle_pricing.repository.CycleRepocitory;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CycleService {
	
	
	private final CycleRepocitory cyclerepository;
	
	public Cycle addCycle(Cycle cycle) {
		return cyclerepository.save(cycle);
	}
	
	public List<Cycle> getAllCycle(){
		return cyclerepository.findAll();
	}
	public Cycle getByCycleId(int id) {
		return cyclerepository.findById(id).orElseThrow();
	}
	
	public void updateCycle(Cycle cycle, int id) {
		Cycle c=cyclerepository.findById(id).orElseThrow();
		
		
		c.setName(cycle.getName());
		cyclerepository.save(c);
		
	}
	public void deleteCycle(int id) {
		cyclerepository.deleteById(id);
	}
}
