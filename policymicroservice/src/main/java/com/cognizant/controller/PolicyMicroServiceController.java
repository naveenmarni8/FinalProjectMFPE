package com.cognizant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.model.Policy;
import com.cognizant.model.ProviderPolicy;
import com.cognizant.repository.PolicyRepo;
import com.cognizant.repository.ProviderPolicyRepo;

@RestController
public class PolicyMicroServiceController {
	@Autowired
	private ProviderPolicyRepo providerPolicyRepo;
	
	@Autowired
	private PolicyRepo policyRepo;
	
	@GetMapping("/getChainOfProviders/{id}")
	public ProviderPolicy  GetChainProviders(@PathVariable("id") int policyId)
	{
		//System.out.println("Helllo   --- "+policyId);
		return providerPolicyRepo.findmethod();
		//return providerPolicyRepo.findAllByPolicyIdOrderByLocation(policyId);
	}
	@GetMapping("/getpolicy")
	public Policy getPolicy()
	{
		Policy policy=policyRepo.findById(100);
		System.out.println("fsdf  "+policy.getPolicyId());
		return policy;
	}

}
