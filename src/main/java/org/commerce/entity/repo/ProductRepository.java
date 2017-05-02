package org.commerce.entity.repo;

import org.commerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  ProductRepository  extends JpaRepository<Product, Long>{

}
