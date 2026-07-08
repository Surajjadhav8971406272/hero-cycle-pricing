package com.suraj.hero_cycle_pricing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suraj.hero_cycle_pricing.entity.Cycle;

public interface CycleRepocitory extends JpaRepository<Cycle, Integer> {

}
