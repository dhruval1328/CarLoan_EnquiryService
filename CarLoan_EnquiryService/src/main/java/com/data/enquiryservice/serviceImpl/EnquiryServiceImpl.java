package com.data.enquiryservice.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.enquiryservice.model.CustomerEnquiry;
import com.data.enquiryservice.repository.EnquiryRepository;
import com.data.enquiryservice.serviceI.EnquiryServiceI;
@Service
public class EnquiryServiceImpl implements EnquiryServiceI{

	@Autowired
	EnquiryRepository er;

	@Override
	public CustomerEnquiry savedata(CustomerEnquiry ce) {
		
		CustomerEnquiry cus = er.save(ce);
		return cus;
	}
}
