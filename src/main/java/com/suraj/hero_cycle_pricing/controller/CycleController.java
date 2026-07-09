package com.suraj.hero_cycle_pricing.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.suraj.hero_cycle_pricing.entity.Cycle;
import com.suraj.hero_cycle_pricing.service.CycleService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/cycles")
@RequiredArgsConstructor
public class CycleController {
	 private final CycleService cycleService;
	 
	 @GetMapping
	 public String getAllCycle(Model model) {
		 List<Cycle> cycles=cycleService.getAllCycle();
		 model.addAttribute("cycles", cycles);
		  
		  return "cycle";
	 }
	 @GetMapping("/add")
	 public String addCycle() {
		 return "add-cycle";
	 }
	 
	 @PostMapping("/add")
	 public String addCycle(@ModelAttribute Cycle cycle) {
		 cycleService.addCycle(cycle);
		 return "redirect:/cycles";
		 
	 }
	 @GetMapping("/edit")
	 public String editCycle(Model model,@RequestParam  int id) {
		 Cycle cycle=cycleService.getByCycleId(id);
		 model.addAttribute("cycle", cycle);
		 return "edit-cycle";
	 }
	 @PostMapping("/update")
	 public String updateCycle(@ModelAttribute Cycle cycle,@RequestParam int id) {
		 cycleService.updateCycle(cycle,id);
		 return "redirect:/cycles";
	 }
	 @RequestMapping("/delete")
	 public String deleteCycle(@RequestParam int  id) {
		 cycleService.deleteCycle(id);
		 return "redirect:/cycles";
	 }
}
