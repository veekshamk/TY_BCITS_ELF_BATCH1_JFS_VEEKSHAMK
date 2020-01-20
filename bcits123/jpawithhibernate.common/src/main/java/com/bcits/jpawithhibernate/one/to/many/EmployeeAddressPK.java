package com.bcits.jpawithhibernate.one.to.many;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Id;

import lombok.Data;
@Data
@Embeddable

public class EmployeeAddressPK implements Serializable {
	
	private int emp_id;
	private String address_type;

}
