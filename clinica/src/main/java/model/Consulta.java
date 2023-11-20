package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "consulta")
public class Consulta implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCONSULTA")
	private Integer id;
	private String data;
	private String observacao;
	private String queixa;
	private String historico;
	
	@ManyToOne
	@JoinColumn(name = "idVETERINARIO")
	private Veterinario veterinario;
	
	
	public Consulta(Integer id, String data, String observacao, String queixa, String historico,
			Veterinario veterinario) {
		super();
		this.id = id;
		this.data = data;
		this.observacao = observacao;
		this.queixa = queixa;
		this.historico = historico;
		this.veterinario = veterinario;
	}

	public Consulta() {
		super();
	}

	
	
	public Veterinario getVeterinario() {
		return veterinario;
	}

	public void setVeterinario(Veterinario veterinario) {
		this.veterinario = veterinario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getQueixa() {
		return queixa;
	}

	public void setQueixa(String queixa) {
		this.queixa = queixa;
	}

	public String getHistorico() {
		return historico;
	}

	public void setHistorico(String historico) {
		this.historico = historico;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	


}
