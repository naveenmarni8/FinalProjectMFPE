package com.cognizant.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.model.MemberPolicy;
@Repository
public interface MemberPolicyRepo extends JpaRepository<MemberPolicy,Integer>{

}
