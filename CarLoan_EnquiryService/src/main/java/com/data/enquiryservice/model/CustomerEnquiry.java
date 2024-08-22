package com.data.enquiryservice.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CustomerEnquiry {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long customerId;
	private String customerName;
	private String email;
	private long mobile;
	private String gender;
	private long pancard;
	private String dob;
	private String remark;
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	
}
