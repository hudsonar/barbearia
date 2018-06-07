package com.abobora.facade;

import java.util.List;

import com.abobora.domain.Cliente;

public interface IClienteFacade {

	List<Cliente> getClientes();

	Cliente getClienteId(Long id);

	void excluirCliente(Long id);

	void salvarCliente(Cliente cliente);

	void atualizarCliente(Cliente cliente);

}