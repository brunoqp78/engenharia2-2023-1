package model;

import java.io.Serializable;
import java.sql.Time;
import java.time.Instant;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	
	@OneToMany(mappedBy = "veterinario")
	private List<Consulta> consultas;
	
	public Veterinario() {
		super();
	}
	
	
	

	public Veterinario(Integer idVeterinario, String nome, String especialidade, List<Consulta> consultas) {
		super();
		this.idVeterinario = idVeterinario;
		this.nome = nome;
		this.especialidade = especialidade;
		this.consultas = consultas;
	}




	public List<Consulta> getConsultas() {
		return consultas;
	}




	public void setConsultas(List<Consulta> consultas) {
		this.consultas = consultas;
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
