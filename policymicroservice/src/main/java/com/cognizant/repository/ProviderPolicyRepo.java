package com.cognizant.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognizant.model.ProviderPolicy;

@Repository
public interface ProviderPolicyRepo extends JpaRepository<ProviderPolicy,Integer> {
	//@Query
	List<ProviderPolicy> findAllByPolicyIdOrderByLocation(int PolicyId);
	@Query(value="select u.policyid from provider_policy  u where u.policyid=100",nativeQuery=true)
	ProviderPolicy findmethod();

}
