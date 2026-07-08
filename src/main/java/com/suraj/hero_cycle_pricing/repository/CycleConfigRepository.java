package com.suraj.hero_cycle_pricing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suraj.hero_cycle_pricing.entity.CycleConfiguration;

public interface CycleConfigRepository extends JpaRepository<CycleConfiguration, Integer> {

}
