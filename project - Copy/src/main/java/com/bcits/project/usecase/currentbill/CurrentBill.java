package com.bcits.project.usecase.currentbill;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="Current_Bill")
public class CurrentBill implements Serializable{
	@Id
	@Column
	private String meterNumber;
	@Column
	private double unitsConsumed;
	@Column
	private Date billDate;
	@Column
	private Date dueDate;
	@Column
	private double meterReading;
	@Column
	private double previousMeterReading;
	

}
