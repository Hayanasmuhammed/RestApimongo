package com.example.Restapi.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.Restapi.Model.User;

public interface UserRepository extends MongoRepository<User,String>{

	
  
}
