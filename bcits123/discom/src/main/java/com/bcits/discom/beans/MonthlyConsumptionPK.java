package com.bcits.discom.beans;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class MonthlyConsumptionPK implements Serializable{
	
	private String rrNumber;
	private String region; 

}
