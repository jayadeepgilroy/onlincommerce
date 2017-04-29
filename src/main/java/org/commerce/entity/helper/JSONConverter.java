package org.commerce.entity.helper;

import javax.persistence.AttributeConverter;

import org.commerce.entity.Attributes;

public class JSONConverter implements AttributeConverter<Attributes, String> {

	@Override
	public String convertToDatabaseColumn(Attributes arg0) {
		// TODO Auto-generated method stub
		return "abc";
	}

	@Override
	public Attributes convertToEntityAttribute(String arg0) {
		//
		return null;
	}

}
