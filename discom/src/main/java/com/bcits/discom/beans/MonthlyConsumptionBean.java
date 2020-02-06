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
	private MonthlyConsumptionPK consumptionPk;
	@Column(name="units_consumed")
	private int unitsConsumed;
	@Column
	private String region;
	@Column(name="bill_amount")
	private double billAmount;

}