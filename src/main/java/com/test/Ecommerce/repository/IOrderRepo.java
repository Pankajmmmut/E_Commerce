package com.test.Ecommerce.repository;

import com.test.Ecommerce.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface IOrderRepo extends CrudRepository<Order,Integer> {
}
