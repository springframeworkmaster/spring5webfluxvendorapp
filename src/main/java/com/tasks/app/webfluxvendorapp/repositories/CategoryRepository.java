package com.tasks.app.webfluxvendorapp.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.tasks.app.webfluxvendorapp.domain.Category;

public interface CategoryRepository extends ReactiveMongoRepository <Category, String>{
}
