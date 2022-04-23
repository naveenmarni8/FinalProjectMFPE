package com.cognizant.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="policy")
public class Policy 
{
	@Id
	private int policyId;
	private int policyNumber;
	private int benefitId;
	private double premium;
	private int tenure;
	private double capAmountBenefits;
}
