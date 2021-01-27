package com.Client.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Entity
@Document(collection="mongoClient")
public class Client {
	 @Id 
	  
	 private Long id;
	  private String nom;
	  private String prenom;
	  private String email;
	  private String phone;
	  private Long numCompte;
	  private String role;
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Long getNumCompte() {
		return numCompte;
	}
	public void setNumCompte(Long numCompte) {
		this.numCompte = numCompte;
	}
	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", phone=" + phone
				+ ", numCompte=" + numCompte + "]";
	}
	public Client(Long id, String nom, String prenom, String email, String phone, Long numCompte,String role) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.phone = phone;
		this.numCompte = numCompte;
		this.role=role;
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	  

}
