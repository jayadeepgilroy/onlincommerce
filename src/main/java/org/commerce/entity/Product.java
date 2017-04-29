package org.commerce.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Product {
	
	@Id@GeneratedValue
	 long id;
	 String name;
	 String description;
	
	@OneToMany
	 List<Sku> skus;
	
	

}
