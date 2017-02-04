package com.softtek.academy.domain;

import javax.persistence.AttributeConverter;

public class StatusBookConverter implements AttributeConverter<String, Integer> {

	@Override
	public Integer convertToDatabaseColumn(String statusString) {
		int myStatus = 0;
		if (statusString == "available") {
			myStatus = 1;
		}
		if (statusString == "not available") {
			myStatus = 2;
		}
		return myStatus;
	}

	@Override
	public String convertToEntityAttribute(Integer statusInt) {
		String myStatus = "";
		switch (statusInt) {
		case 1:
			myStatus = "available";
			break;
		case 2:
			myStatus = "not available";
			break;
		default:
			break;
		}
		return myStatus;
	}
}
