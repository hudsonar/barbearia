package com.abobora.domain;

import java.math.BigDecimal;
import java.util.Date;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
@Entity
@Table(name="TB_EXECUCAO_SERVICO")
@XmlRootElement
public class ExecucaoServico {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CD_EXECUCAO_SERVICO")
	private Long id;
	
	@ManyToOne
	@JoinColumn(referencedColumnName="CD_SERVICO", name="CD_SERVICO")
	private Servico servico;
	
	@ManyToOne
	@JoinColumn(referencedColumnName="CD_CLIENTE", name="CD_CLIENTE")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(referencedColumnName="CD_BARBEIRO", name="CD_BARBEIRO")
	private Barbeiro barbeiro;
	
	@Enumerated(EnumType.STRING)
	@Column(name="DS_MATERIAL_TRABALHO")
	private MaterialTrabalho materialTrabalho;
	
	@Enumerated(EnumType.STRING)
	@Column(name="DS_TIPOSERVICO")
	private TipoServico tipoServico;
	
	@ManyToOne
	@JoinColumn(name="CD_TURNO", referencedColumnName="CD_TURNO")
	private TurnoTrabalho turnoTrabalho;
	
	@Column(name="DS_TEMPO_SERVICO")
	private Long tempoServico;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_SERVICO")
	private Date dataServico;
	
	@Column(name="PRECO_PAGO")
	private BigDecimal precoPago;
	
	
	
	public ExecucaoServico() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExecucaoServico(Long id, Servico servico, Cliente cliente, Barbeiro barbeiro,
			MaterialTrabalho materialTrabalho, TipoServico tipoServico, TurnoTrabalho turnoTrabalho, Long tempoServico,
			Date dataServico, BigDecimal precoPago) {
		super();
		this.id = id;
		this.servico = servico;
		this.cliente = cliente;
		this.barbeiro = barbeiro;
		this.materialTrabalho = materialTrabalho;
		this.tipoServico = tipoServico;
		this.turnoTrabalho = turnoTrabalho;
		this.tempoServico = tempoServico;
		this.dataServico = dataServico;
		this.precoPago = precoPago;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Barbeiro getBarbeiro() {
		return barbeiro;
	}

	public void setBarbeiro(Barbeiro barbeiro) {
		this.barbeiro = barbeiro;
	}

	public MaterialTrabalho getMaterialTrabalho() {
		return materialTrabalho;
	}

	public void setMaterialTrabalho(MaterialTrabalho materialTrabalho) {
		this.materialTrabalho = materialTrabalho;
	}

	public TipoServico getTipoServico() {
		return tipoServico;
	}

	public void setTipoServico(TipoServico tipoServico) {
		this.tipoServico = tipoServico;
	}

	public TurnoTrabalho getTurnoTrabalho() {
		return turnoTrabalho;
	}

	public void setTurnoTrabalho(TurnoTrabalho turnoTrabalho) {
		this.turnoTrabalho = turnoTrabalho;
	}

	public Long getTempoServico() {
		return tempoServico;
	}

	public void setTempoServico(Long tempoServico) {
		this.tempoServico = tempoServico;
	}

	public Date getDataServico() {
		return dataServico;
	}

	public void setDataServico(Date dataServico) {
		this.dataServico = dataServico;
	}

	public BigDecimal getPrecoPago() {
		return precoPago;
	}

	public void setPrecoPago(BigDecimal precoPago) {
		this.precoPago = precoPago;
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
		ExecucaoServico other = (ExecucaoServico) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
