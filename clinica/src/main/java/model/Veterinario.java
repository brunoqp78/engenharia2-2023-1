package model;

import java.io.Serializable;
import java.sql.Time;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "veterinario")
public class Veterinario implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idVeterinario;	
	
	private String nome;
	private String especialidade;
	
	public Veterinario() {
		super();
	}
	
	public Veterinario(Integer idVeterinario, String nome, String especialidade) {
		super();
		
		this.idVeterinario = idVeterinario;
		this.nome = nome;
		this.especialidade = especialidade;
	}



	public Integer getIdVeterinario() {
		return idVeterinario;
	}

	public void setIdVeterinario(Integer idVeterinario) {
		this.idVeterinario = idVeterinario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
}
