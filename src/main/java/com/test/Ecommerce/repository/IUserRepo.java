package com.test.Ecommerce.repository;

import com.test.Ecommerce.model.User;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepo extends CrudRepository<User,Integer> {
}
