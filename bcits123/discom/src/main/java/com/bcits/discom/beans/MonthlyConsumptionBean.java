package com.bcits.discom.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="monthly_consumption")
public class MonthlyConsumptionBean implements Serializable {
	@EmbeddedId
	private MonthlyConsumptionPK consumptionPk;
	@Column(name="units_consumed")
	private double unitsConsumed;
	@Column
	private String region;
	@Column(name="total_amount")
	private double totalAmount;
	@Column(name="initial_reading")
	private long initialReading;
	@Column(name="final_reading")
	private long finalReading;
	@Column
	private String status;
}//End of Class
