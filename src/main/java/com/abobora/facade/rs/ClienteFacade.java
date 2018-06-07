package com.abobora.facade.rs;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.abobora.dao.ClienteDao;
import com.abobora.domain.Cliente;
import com.abobora.facade.IClienteFacade;

@Path(value="/cliente")
@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public class ClienteFacade implements IClienteFacade {
	
	@Inject
	private ClienteDao clienteDao;
	
	@Override
	@GET
	public List<Cliente> getClientes() {
		return clienteDao.getClientes();
	}
	
	@Override
	@GET
	@Path("/{codigo}")
	public Cliente getClienteId(@PathParam(value="codigo") Long id) {
		return clienteDao.getClienteId(id);
	}
	
	@Override
	@DELETE
	@Path("/{codigo}")
	public void excluirCliente(@PathParam(value="codigo") Long id) {
		clienteDao.excluirCliente(id);
	}
	
	@Override
	@POST
	public void salvarCliente(Cliente cliente) {
		clienteDao.inserirCliente(cliente);
	}
	
	@Override
	@PUT
	public void atualizarCliente(Cliente cliente) {
		clienteDao.atualizarCliente(cliente);
	}
	
}





