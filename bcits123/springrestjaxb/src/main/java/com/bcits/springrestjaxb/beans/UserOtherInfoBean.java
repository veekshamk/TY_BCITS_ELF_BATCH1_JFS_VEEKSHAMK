package com.bcits.springrestjaxb.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name="user-other-info")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserOtherInfoBean {
	
	@XmlElement
	private String gender;
	@XmlElement(name="adhar")
	private long adharNumber;

}
