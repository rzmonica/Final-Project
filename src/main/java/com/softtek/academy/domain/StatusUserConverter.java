package com.softtek.academy.domain;

import javax.persistence.AttributeConverter;
import javax.persistence.Convert;

@Convert
public class StatusUserConverter implements AttributeConverter<String, Integer> {

	@Override
	public Integer convertToDatabaseColumn(String statusString) {
		int myStatus = 0;
		if (statusString == "active") {
			myStatus = 1;
		}
		if (statusString == "inactive") {
			myStatus = 2;
		}
		return myStatus;
	}

	@Override
	public String convertToEntityAttribute(Integer statusInt) {
		String myStatus = "";
		switch (statusInt) {
		case 1:
			myStatus = "active";
			break;
		case 2:
			myStatus = "inactive";
			break;
		default:
			break;
		}
		return myStatus;
	}
}
