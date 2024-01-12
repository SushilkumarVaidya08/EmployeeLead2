package com.lead.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lead.entity.Testentity;

public interface LeadRepository extends JpaRepository<Testentity, Integer> {

	static boolean existsByLeadId(int long1) {
		// TODO Auto-generated method stub
		return false;
	}

	static boolean existsByEmail(String email) {
		// TODO Auto-generated method stub
		return false;
	}

}
