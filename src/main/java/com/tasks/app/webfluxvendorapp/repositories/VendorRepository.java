package com.tasks.app.webfluxvendorapp.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.tasks.app.webfluxvendorapp.domain.Vendor;

public interface VendorRepository extends ReactiveMongoRepository<Vendor, String> {
}
