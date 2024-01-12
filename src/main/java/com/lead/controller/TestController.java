package com.lead.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lead.customexception.LeadAlreadyExistsException;
import com.lead.entity.Testentity;
import com.lead.errorresponse.ApiError;
import com.lead.errorresponse.ApiResponse;
import com.lead.errorresponse.ErrorResponse;
import com.lead.service.LeadService;

@RestController
@RequestMapping("/api/leads")
public class TestController {

	@Autowired
	private LeadService testService;

	@PostMapping("/create")
	public ResponseEntity<?> createLead(@RequestBody Testentity te) throws Exception {
		try {
			Testentity createtc = testService.createLead(te);
			return ResponseEntity.status(HttpStatus.CREATED)
					.body(new ApiResponse("success", "Created Leads Successfully"));
		} catch (LeadAlreadyExistsException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST)
					.body(new ErrorResponse("error", new ApiError("E10010", null)));
		}
	}

	@GetMapping("/get")
	public ResponseEntity<?> getAll() {
		List<?> list = testService.getAll();

		return ResponseEntity.ok(list);

	}

	@GetMapping("/get/{leadId}")
	public ResponseEntity<?> fingById(@PathVariable int leadId) {
		testService.getById(leadId);

		return ResponseEntity.status(HttpStatus.FOUND).body("found the data");
	}

}
