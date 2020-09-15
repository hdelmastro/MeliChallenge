package com.meli.mutants.persistence;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.meli.mutants.persistence.model.MutantEntity;

public interface MutantRepository extends MongoRepository<MutantEntity, String> {
	List<MutantEntity> findByDna(String dna);

}
