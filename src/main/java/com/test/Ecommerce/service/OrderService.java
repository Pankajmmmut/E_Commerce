package com.test.Ecommerce.service;

import com.test.Ecommerce.repository.IAddressRepo;
import com.test.Ecommerce.repository.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    IOrderRepo orderRepo;
}
