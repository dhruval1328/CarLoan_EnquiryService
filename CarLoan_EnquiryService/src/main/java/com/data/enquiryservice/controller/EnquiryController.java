package com.data.enquiryservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.data.enquiryservice.model.CustomerEnquiry;
import com.data.enquiryservice.serviceI.EnquiryServiceI;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class EnquiryController {

	@Autowired
	EnquiryServiceI esi;
	
	@PostMapping("/enquiry")
	public ResponseEntity<CustomerEnquiry> enquirydata(@RequestBody CustomerEnquiry ce) {
		
		CustomerEnquiry c = esi.savedata(ce);
		ResponseEntity<CustomerEnquiry> re = new ResponseEntity<CustomerEnquiry>(c, HttpStatus.OK);
		return re;
	}
	
}
