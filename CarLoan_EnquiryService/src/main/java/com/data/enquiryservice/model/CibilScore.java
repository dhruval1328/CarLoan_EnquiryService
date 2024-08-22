package com.data.enquiryservice.model;

import com.data.enquiryservice.enums.CibilStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CibilScore {
	@Id
	private long cibilId;
	private long cibilscore;
	private String cibilDate;
	@Enumerated(EnumType.STRING)
	private CibilStatus status;	
}
