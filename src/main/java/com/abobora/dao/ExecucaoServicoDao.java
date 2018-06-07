package com.abobora.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.abobora.domain.ExecucaoServico;


public class ExecucaoServicoDao {
	@PersistenceContext(name="SistemaBarbeariaPU")
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	public List<ExecucaoServico> getExecucaoServicos() {
		Query query = entityManager.createQuery("from ExecucaoServico p");
		return query.getResultList();
	}
	
	public ExecucaoServico getExecucaoServicoId(Long id) {
		return entityManager.find(ExecucaoServico.class,id);
	}
	
	@Transactional
	public void excluirExecucaoServico(Long id) {
		ExecucaoServico p = getExecucaoServicoId(id);
		entityManager.remove(p);
	}
	
	@Transactional
	public void inserirExecucaoServico(ExecucaoServico execucaoServico) {
		entityManager.persist(execucaoServico);
	}
	
	@Transactional
	public void atualizarExecucaoServico(ExecucaoServico execucaoServico) {
		execucaoServico = entityManager.merge(execucaoServico);
		entityManager.persist(execucaoServico);
	}

}
