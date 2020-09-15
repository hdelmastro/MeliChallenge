package com.meli.mutants.persistence.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
/**
 * 
 * @author hdelmastro@gmail.com
 *
 */
@Document(collection = "Processed")
public class ProcessedEntity {

	@Id
	private String Id;	
	
}
