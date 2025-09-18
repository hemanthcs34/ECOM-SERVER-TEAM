package com.mtd.ecom_server.repos;

import com.mtd.ecom_server.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<User, String> {
}
