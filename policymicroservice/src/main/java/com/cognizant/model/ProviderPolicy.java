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
@Table(name="provider_policy")
public class ProviderPolicy {
	
	@Id
	public int providerId;
	public String providerName;
	public String providerAddress;
	public int policyId;
	public String location;
}
