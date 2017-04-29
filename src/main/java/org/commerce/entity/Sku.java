package org.commerce.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Sku {

	@Id
	@GeneratedValue
	Long id;
	String name;
	String type;

	@ManyToOne
	Product product;

}
