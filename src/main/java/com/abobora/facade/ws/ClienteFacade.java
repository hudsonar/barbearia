package com.abobora.facade.ws;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.abobora.dao.ClienteDao;
import com.abobora.domain.Cliente;
import com.abobora.facade.IClienteFacade;


@WebService(serviceName="ws/cliente")
public class ClienteFacade implements IClienteFacade {
	
	@Inject
	private ClienteDao clienteDao;
	
	@Override
	@WebMethod
	public List<Cliente> getClientes() {
		return clienteDao.getClientes();
	}
	
	@Override
	@WebMethod
	public Cliente getClienteId(@WebParam(name="id") Long id) {
		return clienteDao.getClienteId(id);
	}
	
	@Override
	@WebMethod
	public void excluirCliente(@WebParam(name="id") Long id) {
		clienteDao.excluirCliente(id);
	}
	
	@Override
	@WebMethod
	public void salvarCliente(@WebParam(name="cliente") Cliente cliente) {
		clienteDao.inserirCliente(cliente);
	}
	
	@Override
	@WebMethod
	public void atualizarCliente(@WebParam(name="cliente") Cliente cliente) {
		clienteDao.atualizarCliente(cliente);
	}
	
}





