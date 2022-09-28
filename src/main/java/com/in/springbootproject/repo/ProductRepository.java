package com.in.springbootproject.repo;

import com.in.springbootproject.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Integer> {
}
