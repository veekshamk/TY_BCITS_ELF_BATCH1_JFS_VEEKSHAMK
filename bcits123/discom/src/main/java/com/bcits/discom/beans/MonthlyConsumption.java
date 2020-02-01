package com.bcits.discom.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Monthly_Consumption")
public class MonthlyConsumption implements Serializable {
	@EmbeddedId
	private MonthlyConsumptionPK consumption;
	@Column
	private int unitsConsumed;
	@Column
	private String status;
	@Column
	private double billAmount;

}
