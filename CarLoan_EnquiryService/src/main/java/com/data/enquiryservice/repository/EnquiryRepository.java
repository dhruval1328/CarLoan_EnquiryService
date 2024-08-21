package com.data.enquiryservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.data.enquiryservice.model.CustomerEnquiry;
@Repository
public interface EnquiryRepository extends JpaRepository<CustomerEnquiry, Integer>{

}
