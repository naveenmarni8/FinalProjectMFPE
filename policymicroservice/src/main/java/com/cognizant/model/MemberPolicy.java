package com.cognizant.model;

import java.util.Date;

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
@Table(name="member_policy")
public class MemberPolicy {
	@Id
	private int memberId;
	private int policyNumber;
	private int policyId;
	private int benefitId;
	private Date subscriptionDate;
	private int tenure;
	private double capAmountBenefits;
}
