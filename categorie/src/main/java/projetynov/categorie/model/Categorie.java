package projetynov.categorie.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Categorie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
	private Long id;
	@Column(name="typeCategorie")
	private String typeCategorie;
	@Column(name="nom")
	private String nom;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTypeCategorie() {
		return typeCategorie;
	}
	public void setTypeCategorie(String typeCategorie) {
		this.typeCategorie = typeCategorie;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	

}
