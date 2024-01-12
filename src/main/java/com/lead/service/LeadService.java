package com.lead.service;

import java.util.List;

import org.aspectj.weaver.ast.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lead.customexception.LeadAlreadyExistsException;
import com.lead.entity.Testentity;
import com.lead.repository.LeadRepository;

@Service
public class LeadService {

	@Autowired
	private LeadRepository leadRepository;

	public Testentity createLead(Testentity lead) throws Exception {

		if (LeadRepository.existsByLeadId(lead.getLeadId())) {
			throw new LeadAlreadyExistsException("Lead already exists in the database with the lead id");
		}

		if (LeadRepository.existsByEmail(lead.getEmail())) {
			throw new LeadAlreadyExistsException("Lead already exists in the database with the email");
		}

		// Add additional validation logic for other fields

		return leadRepository.save(lead);
	}

	public List<?> getAll() {
		List<Testentity> list = leadRepository.findAll();
		return list;
	}

	public String getById(int leadId) {
		leadRepository.findById(leadId);

		return "got the data";

	}

}
