package com.suraj.hero_cycle_pricing.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.suraj.hero_cycle_pricing.entity.Part;
import com.suraj.hero_cycle_pricing.service.PartService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class partController {
	
	private final PartService partService;
	@GetMapping
	public String getAllPart(Model model) {
	List<Part> parts=partService.getAllPart();
	model.addAttribute("parts", parts);
		return "parts";
	}
	@GetMapping("/add")
	public String addPart() {
		
		return "add-part";
	}
	@PostMapping("/add")
	public String addPart(@ModelAttribute Part part) {
		partService.addPart(part);
		return "redirect:/";
	}
	@GetMapping("/delete")
	public String deletePart(@RequestParam int id) {
		partService.deletePart(id);
		return "redirect:/parts";
	}
	@GetMapping("/edit")
	public String editPart(Model model,@RequestParam int id) {
	model.addAttribute("part",partService.getById(id));
		return "edit-part";
	}
	@PostMapping("/update/{id}")
	public String updatePart(@ModelAttribute Part part,int id) {
		partService.updatePart(part, id);
		return "redirect/:parts";
	}

}
