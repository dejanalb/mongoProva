package com.rjcsoft.mongoprova.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.rjcsoft.mongoprova.model.Anagrafica;

@Repository
public interface AnagraficaRepository extends MongoRepository<Anagrafica, String> {

	
}
