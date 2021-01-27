package com.Client.controller;

import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Client.Repository.ClientRepo;
import com.Client.Service.ClientServ;
import com.Client.entities.Client;

@RestController
//@RequestMapping("/Client")
public class ClientController {
@Autowired
ClientRepo clientrepo;
	@Autowired
	ClientServ clientservice;
	
	@GetMapping(value="/Clients")
	public List<Client> getClients(){
		List<Client> clients;
		clients=clientservice.getAllClients();
		return clients;
	}
	@GetMapping(value="/Clientid/{id}")
	@Transactional
	public Optional<Client> getClientById(@PathVariable Long id){
		Optional<Client> client=clientservice.getClientById(id);
		if(client==null) {
			return Optional.empty();

		}
		else 
			return client;
	}
	
	@GetMapping(value="/ClientCompte/{numC}")
	@Transactional
	public Optional<Client> getClientBynumCompte(@PathVariable Long numC){
		Optional<Client> client=clientservice.getClientByNumCompte(numC);
		if(client==null) {
			return Optional.empty();

		}
		else return client;
	}
	@PostMapping(value="/AjoutClient")
	@Transactional
	public ResponseEntity<?> ajoutclient(@RequestBody Client client){
		clientservice.saveClient(client);
		return new ResponseEntity<Client>(client,HttpStatus.ACCEPTED);	
	}
	
	@PutMapping(value="/Updatephone/{id}")
	@Transactional
	public ResponseEntity<?> changerphone(@RequestBody Client client,@PathVariable Long id){
		Optional<Client> cl=clientservice.getClientById(id);
		(cl.get()).setPhone(client.getPhone());
		Client clientupdated=clientservice.updateClient(cl.get());
		return  new ResponseEntity<Client> (clientupdated,HttpStatus.OK);
	}
	
}
