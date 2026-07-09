package com.suraj.hero_cycle_pricing.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.suraj.hero_cycle_pricing.Dto.PriceItem;
import com.suraj.hero_cycle_pricing.service.CycleService;
import com.suraj.hero_cycle_pricing.service.PartService;
import com.suraj.hero_cycle_pricing.service.PricingService;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class PricingController {

    private final CycleService cycleService;
    private final PartService partService;
    private final PricingService pricingService;

    @GetMapping("/pricing")
    public String pricing(Model model) {

        model.addAttribute("cycles", cycleService.getAllCycle());
        model.addAttribute("parts", partService.getAllPart());

        return "pricing";
    }

    @PostMapping("/calculate")
    public String calculate(HttpServletRequest request,
                            Model model) {

        List<com.suraj.hero_cycle_pricing.entity.Part> parts =
                partService.getAllPart();

        int[] quantity = new int[parts.size()];

        for (int i = 0; i < parts.size(); i++) {

            String value =
                    request.getParameter("qty_" + parts.get(i).getId());

            quantity[i] = Integer.parseInt(value);

        }

        List<PriceItem> result =
                pricingService.calculatePrice(quantity);

        int cycleId = Integer.parseInt(request.getParameter("cycleId"));

        String cycleName =
                cycleService.getByCycleId(cycleId).getName();

        model.addAttribute("cycleName", cycleName);

        model.addAttribute("items", result);

        model.addAttribute("grandTotal",
                pricingService.getGrandTotal(result));

        return "price-result";
    }

}