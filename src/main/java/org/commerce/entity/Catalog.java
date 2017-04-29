package org.commerce.entity;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.commerce.entity.helper.JSONConverter;

@Entity
public class Catalog {
	
	@Id@GeneratedValue
	Long id;
	String name;
	String type;
	boolean active;
	
	@Convert(converter = JSONConverter.class)
	private  Attributes attributes;
	

}
