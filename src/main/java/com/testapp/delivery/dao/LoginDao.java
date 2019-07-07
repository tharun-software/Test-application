package com.testapp.delivery.dao;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.testapp.delivery.entity.LoginUser;

@Repository

public interface LoginDao extends MongoRepository<LoginUser, ObjectId> {

}
