package com.suraj.hero_cycle_pricing.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.suraj.hero_cycle_pricing.entity.Part;
import com.suraj.hero_cycle_pricing.service.PartService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/parts")
@RequiredArgsConstructor
public class partController {
	
	private final PartService partService;
	@GetMapping
	public String getAllPart(Model model) {
	List<Part> part=partService.getAllPart();
	model.addAttribute("part", part);
		return "parts";
	}
	@GetMapping("/add")
	public String addPart() {
		
		return "add-part";
	}
	@PostMapping("/save")
	public String addPart(@ModelAttribute Part part) {
		partService.addPart(part);
		return "redirect:/parts";
	}
	@GetMapping("/delete/{id}")
	public String deletePart(@PathVariable int id) {
		partService.deletePart(id);
		return "redirect:/parts";
	}
	@GetMapping("/edit/{id}")
	public String editPart(Model model,@PathVariable int id) {
		partService.getById(id);
		return "edit-part";
	}
	@PostMapping("/update/{id}")
	public String updatePart(@ModelAttribute Part part,int id) {
		partService.updatePart(part, id);
		return "redirect/:parts";
	}

}
