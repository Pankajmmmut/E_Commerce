package com.test.Ecommerce.repository;

import com.test.Ecommerce.model.Address;
import org.springframework.data.repository.CrudRepository;

public interface IAddressRepo extends CrudRepository<Address,Integer> {
}
