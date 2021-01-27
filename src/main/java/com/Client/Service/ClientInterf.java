package com.Client.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Client.entities.Client;
@Service
public interface ClientInterf {
	List<Client> getAllClients() ;
	Optional<Client> getClientById(Long id) ;
	Optional<Client> getClientByNumCompte(Long numc);
	Client saveClient(Client Client) ;

}
