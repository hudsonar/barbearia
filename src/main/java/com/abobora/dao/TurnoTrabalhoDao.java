package com.abobora.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.abobora.domain.TurnoTrabalho;


public class TurnoTrabalhoDao {
	@PersistenceContext(name="SistemaBarbeariaPU")
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	public List<TurnoTrabalho> getTurnoTrabalhos() {
		Query query = entityManager.createQuery("from TurnoTrabalho p");
		return query.getResultList();
	}
	
	public TurnoTrabalho getTurnoTrabalhoId(Long id) {
		return entityManager.find(TurnoTrabalho.class, id);
	}
	
	@Transactional
	public void excluirTurnoTrabalho(Long id) {
		TurnoTrabalho p = getTurnoTrabalhoId(id);
		entityManager.remove(p);
	}
	
	@Transactional
	public void inserirTurnoTrabalho(TurnoTrabalho turnoTrabalho) {
		entityManager.persist(turnoTrabalho);
	}
	
	@Transactional
	public void atualizarTurnoTrabalho(TurnoTrabalho turnoTrabalho) {
		turnoTrabalho = entityManager.merge(turnoTrabalho);
		entityManager.persist(turnoTrabalho);
	}

}
