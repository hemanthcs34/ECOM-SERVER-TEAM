package com.mtd.ecom_server.repos;

import com.mtd.ecom_server.models.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepo extends MongoRepository<Order, String> {
}
