package com.suraj.hero_cycle_pricing.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
@Entity
@Data
public class CycleConfiguration {
	@Id
	private int id;
	@ManyToOne
    @JoinColumn(name = "cycle_id", nullable = false)
	private Cycle cycle;
	
	 @ManyToOne
	 @JoinColumn(name = "part_id", nullable = false)
	private Part part;
	private int quantity;

}
