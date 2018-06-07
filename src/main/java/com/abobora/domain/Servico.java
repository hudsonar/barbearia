package com.abobora.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="TB_SERVICO")
@XmlRootElement
public class Servico {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CD_SERVICO")
	private Long id;
	@Column(name="DS_SERVICO")
	private String descricao;
	
	@Enumerated(EnumType.STRING)
	@Column(name="CD_TIPO_SERVICO")
	private TipoServico tipoServico;
	
	@Column(name="TEMPO")
	private Long tempo;

	@Column(name="PRECO")
	private BigDecimal preco;
	
	
	
	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public TipoServico getTipoServico() {
		return tipoServico;
	}

	public void setTipoServico(TipoServico tipoServico) {
		this.tipoServico = tipoServico;
	}

	public Long getTempo() {
		return tempo;
	}

	public void setTempo(Long tempo) {
		this.tempo = tempo;
	}

	public Servico(Long id, String descricao, TipoServico tipoServico, Long tempo) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.tipoServico = tipoServico;
		this.tempo = tempo;
	}

	public Servico() {
		super();
		// TODO Auto-generated constructor stub
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
		Servico other = (Servico) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
}
