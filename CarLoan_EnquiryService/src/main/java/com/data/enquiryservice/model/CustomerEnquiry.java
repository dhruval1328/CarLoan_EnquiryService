package com.data.enquiryservice.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
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
	private long CustomerId;
	private String CustomerName;
	private String Email;
	private long mobile;
	private String gender;
	private long pancard;
	private String DOB;
	private String remark;
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
//	@OneToOne(cascade = CascadeType.DETACH.MERGE.REMOVE.REFRESH)
//	private CibilScore cibil;
}
