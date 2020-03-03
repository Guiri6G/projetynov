package projetynov.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Commentaire {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
	private Long id;
	@Column(name="dateCom")
	private Date dateCom;
	@Column(name="contenuCom")
	private String contenuCom;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getdateCom() {
		return dateCom;
	}
	public void setdateCom(Date dateCom) {
		this.dateCom = dateCom;
	}
	public String contenuCom() {
		return contenuCom;
	}
	public void contenuCom(String contenuCom) {
		this.contenuCom = contenuCom;
	}
		
}
