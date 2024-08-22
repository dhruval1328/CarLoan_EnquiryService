package com.data.enquiryservice.serviceI;

import java.util.List;

import com.data.enquiryservice.model.CustomerEnquiry;

public interface EnquiryServiceI {

	CustomerEnquiry savedata(CustomerEnquiry ce);

	CustomerEnquiry getdata(int id);

	CustomerEnquiry updatedata(int i, CustomerEnquiry cj);

	void removedata(int id);

	

}
