package com.bcits.project.usecase.billhistory;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;

import lombok.Data;
@Data
@Embeddable
public class BillHistoryPK implements Serializable{
	
	private String meterNumber;
	private Date date;
}
