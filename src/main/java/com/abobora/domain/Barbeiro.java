package com.abobora.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
@Entity
@Table(name="TB_BARBEIRO")
@XmlRootElement
public class Barbeiro implements Serializable{
	
	private static final long serialVersionUID = 7057202917507052905L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CD_BARBEIRO")
	private Long id;
	
	@Column(name="DS_NOME")
	private String nome;
	
	@Column(name="DS_TELEFONE")
	private String telefone;
	
	@Column(name="DS_EMAIL")
	private String email;
	
	@Enumerated(EnumType.STRING)
	@Column(name="DS_MATERIAL_TRABALHO")
	private MaterialTrabalho materialTrabalho;
	
	
	@ManyToOne
	@JoinColumn(referencedColumnName="CD_TURNO", name="CD_TURNO")
	private TurnoTrabalho turnoTrabalho;
	
	@Column(name="ATIVO")
	private Boolean ativo;
	
	
	
	
	public Barbeiro() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Barbeiro(Long id, String nome, String telefone, String email, MaterialTrabalho materialTrabalho,
			TurnoTrabalho turnoTrabalho, Boolean ativo) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.materialTrabalho = materialTrabalho;
		this.turnoTrabalho = turnoTrabalho;
		this.ativo = ativo;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getTelefone() {
		return telefone;
	}



	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public MaterialTrabalho getMaterialTrabalho() {
		return materialTrabalho;
	}



	public void setMaterialTrabalho(MaterialTrabalho materialTrabalho) {
		this.materialTrabalho = materialTrabalho;
	}



	public TurnoTrabalho getTurnoTrabalho() {
		return turnoTrabalho;
	}



	public void setTurnoTrabalho(TurnoTrabalho turnoTrabalho) {
		this.turnoTrabalho = turnoTrabalho;
	}



	public Boolean getAtivo() {
		return ativo;
	}



	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}







	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Barbeiro other = (Barbeiro) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
}
