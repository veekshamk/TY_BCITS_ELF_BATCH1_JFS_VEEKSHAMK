package com.bcits.discom.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class QueryBeanPK implements Serializable{
	@Column(name="rr_number")
	private String rrNumber;
	@Column
	private Date date;
}//End of Class
