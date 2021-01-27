package com.Client.Repository;
import java.util.Optional;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Client.entities.*;
@Repository
public interface ClientRepo extends MongoRepository<Client,Long>{
	Optional<Client> findById(Long id);
	Optional<Client> findByNumCompte(Long numC);
}
