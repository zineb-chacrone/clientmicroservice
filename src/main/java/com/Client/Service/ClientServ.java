package com.Client.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Client.Repository.ClientRepo;
import com.Client.entities.Client;

@Service
public class ClientServ  implements ClientInterf{
@Autowired
private ClientRepo clientrepo;
	@Override
	public List<Client> getAllClients() {
		List<Client> clients=clientrepo.findAll();
		
		return clients;
	}

	@Override
	public Optional<Client> getClientById(Long id) {
		Optional<Client> client=clientrepo.findById(id);
		return client;
	}
	@Override
	public Optional<Client> getClientByNumCompte(Long numC) {
		Optional<Client> client=clientrepo.findByNumCompte(numC);
		return client;
	}

	@Override
	public Client saveClient(Client Client) {
		return clientrepo.insert(Client);
		
	}

	public Client updateClient(Client client) {
		return clientrepo.save(client);
		
	}

}
