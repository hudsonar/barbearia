package com.abobora.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.abobora.domain.Cliente;


public class ClienteDao {
	@PersistenceContext(name="SistemaBarbeariaPU")
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	public List<Cliente> getClientes() {
		Query query = entityManager.createQuery("from Cliente p");
		return query.getResultList();
	}
	
	public Cliente getClienteId(Long id) {
		return entityManager.find(Cliente.class,id);
	}
	
	@Transactional
	public void excluirCliente(Long id) {
		Cliente p = getClienteId(id);
		entityManager.remove(p);
	}
	
	@Transactional
	public void inserirCliente(Cliente cliente) {
		entityManager.persist(cliente);
	}
	
	@Transactional
	public void atualizarCliente(Cliente cliente) {
		cliente = entityManager.merge(cliente);
		entityManager.persist(cliente);
	}

}
