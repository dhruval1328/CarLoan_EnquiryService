package com.data.enquiryservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.data.enquiryservice.model.CustomerEnquiry;
import com.data.enquiryservice.serviceI.EnquiryServiceI;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class EnquiryController {

	@Autowired
	EnquiryServiceI esi;
	
	@PostMapping("/enquiry")
	public ResponseEntity<CustomerEnquiry> enquirydata(@RequestBody CustomerEnquiry ce) {
		
		CustomerEnquiry c = esi.savedata(ce);
		ResponseEntity<CustomerEnquiry> re = new ResponseEntity<CustomerEnquiry>(c, HttpStatus.ACCEPTED);
		return re;
	}
	
	@GetMapping("/user/{customerId}")
	public ResponseEntity<CustomerEnquiry> showdata(@PathVariable("customerId") int id){
		
		CustomerEnquiry s = esi.getdata(id);
		ResponseEntity<CustomerEnquiry> l = new ResponseEntity<CustomerEnquiry>(s, HttpStatus.OK);
		return l;
	}
	
	@PutMapping("/update/{customerId}")
	public ResponseEntity<CustomerEnquiry> modify(@PathVariable("customerId") int i,@RequestBody CustomerEnquiry cj){
		
		CustomerEnquiry m = esi.updatedata(i,cj);
		ResponseEntity<CustomerEnquiry> l = new ResponseEntity<CustomerEnquiry>(m, HttpStatus.ACCEPTED);
		return l;
	}
	
	@DeleteMapping("/delete/{customerId}")
	public String remove(@PathVariable("customerId") int id){
		
		esi.removedata(id);
		return "Deleted";
	}
	
}
