package com.cognizant.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.model.Benefits;

@Repository
public interface BenefitRepo extends JpaRepository<Benefits,Integer> {

}
