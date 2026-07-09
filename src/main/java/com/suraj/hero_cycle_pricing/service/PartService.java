package com.suraj.hero_cycle_pricing.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.suraj.hero_cycle_pricing.Exception.ResourceNotFoundException;
import com.suraj.hero_cycle_pricing.entity.Part;

import com.suraj.hero_cycle_pricing.repository.PartRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PartService {
	
	
	private final PartRepository partRepository;
	
	
	public Part addPart(Part part) {
		return partRepository.save(part);
	}
	
	public List<Part> getAllPart(){
		List<Part> list=partRepository.findAll();
		return list;
	}
	
	public Part getById(int id) {
		return partRepository.findById(id).orElseThrow(() ->new ResourceNotFoundException("Part not found with id : " + id));
	}
	
	public Part updatePart(Part part, int id) {
		Part p=partRepository.findById(id).orElseThrow(() ->new ResourceNotFoundException("Part not found with id : " + id));
		
		if(p==null) {
			return null;
		}
		p.setName(part.getName());
		p.setPrice(part.getPrice());
		return partRepository.save(p);
		
		
	}
	public void deletePart(int id) {
		partRepository.deleteById(id);
	}
	

}
