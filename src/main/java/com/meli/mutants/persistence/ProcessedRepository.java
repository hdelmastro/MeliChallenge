package com.meli.mutants.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.meli.mutants.persistence.model.ProcessedEntity;

public interface ProcessedRepository extends MongoRepository<ProcessedEntity, String> {

}
