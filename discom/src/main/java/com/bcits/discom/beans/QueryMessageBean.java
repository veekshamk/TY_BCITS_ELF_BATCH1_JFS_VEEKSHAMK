package com.bcits.discom.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="query_msg")
public class QueryMessageBean implements Serializable{
	
	@EmbeddedId
	private QueryMsgBeanPK msgPK;
	@Column
	private String queryRequest;
	@Column
	private String queryResponse;
	@Column
	private String region;

}//End of Class
