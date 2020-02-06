package com.bcits.discom.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Monthly_Consumption")
public class MonthlyConsumptionBean implements Serializable {
	@EmbeddedId
	private MonthlyConsumptionPK consumption;
	@Column
	private int unitsConsumed;
	@Column
	private String status;
	@Column
	private double billAmount;

}
