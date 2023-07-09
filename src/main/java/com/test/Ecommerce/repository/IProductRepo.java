package com.test.Ecommerce.repository;

import com.test.Ecommerce.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface IProductRepo extends CrudRepository<Product,Integer> {
}
