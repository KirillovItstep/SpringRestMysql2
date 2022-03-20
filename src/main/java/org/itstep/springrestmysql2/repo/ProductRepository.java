package org.itstep.springrestmysql2.repo;

import org.itstep.springrestmysql2.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
