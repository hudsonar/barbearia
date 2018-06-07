package com.abobora.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.abobora.domain.Servico;


public class ServicoDao {
	@PersistenceContext(name="SistemaBarbeariaPU")
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	public List<Servico> getServicos() {
		Query query = entityManager.createQuery("from Servico p");
		return query.getResultList();
	}
	
	public Servico getServicoId(Long id) {
		return entityManager.find(Servico.class,id);
	}
	
	@Transactional
	public void excluirServico(Long id) {
		Servico p = getServicoId(id);
		entityManager.remove(p);
	}
	
	@Transactional
	public void inserirServico(Servico servico) {
		entityManager.persist(servico);
	}
	
	@Transactional
	public void atualizarServico(Servico servico) {
		servico = entityManager.merge(servico);
		entityManager.persist(servico);
	}

}
