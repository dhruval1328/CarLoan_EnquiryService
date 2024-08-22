package com.data.enquiryservice.serviceImpl;

import java.util.List;
import java.util.Optional;

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

	@Override
	public CustomerEnquiry getdata(int id) {
		Optional<CustomerEnquiry> l = er.findById(id);
		if(l.isPresent()) {
			CustomerEnquiry c = l.get();
			return c;
		}
		
		return null;
	}

	

	@Override
	public CustomerEnquiry updatedata(int i, CustomerEnquiry cj) {
		CustomerEnquiry c = er.save(cj);
		return c;
	}

	@Override
	public void removedata(int id) {
		er.deleteById(id);
	}

	
}
