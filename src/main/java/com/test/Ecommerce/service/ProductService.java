package com.test.Ecommerce.service;

import com.test.Ecommerce.repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    IProductRepo productRepo;
}
