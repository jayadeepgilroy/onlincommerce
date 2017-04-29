package org.commerce.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Price {
	@Id @GeneratedValue
	Long id;
	
	Double money;

}
