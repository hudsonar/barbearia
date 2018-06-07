package com.abobora.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.abobora.domain.Barbeiro;


public class BarbeiroDao {
	@PersistenceContext(name="SistemaBarbeariaPU")
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	public List<Barbeiro> getBarbeiros() {
		Query query = entityManager.createQuery("from Barbeiro p");
		return query.getResultList();
	}
	
	public Barbeiro getBarbeiroId(Long id) {
		return entityManager.find(Barbeiro.class,id);
	}
	
	@Transactional
	public void excluirBarbeiro(Long id) {
		Barbeiro p = getBarbeiroId(id);
		entityManager.remove(p);
	}
	
	@Transactional
	public void inserirBarbeiro(Barbeiro barbeiro) {
		entityManager.persist(barbeiro);
	}
	
	@Transactional
	public void atualizarBarbeiro(Barbeiro barbeiro) {
		barbeiro = entityManager.merge(barbeiro);
		entityManager.persist(barbeiro);
	}

}
