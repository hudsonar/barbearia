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

import com.abobora.dao.BarbeiroDao;
import com.abobora.domain.Barbeiro;
import com.abobora.facade.IBarbeiroFacade;

@Path(value="/barbeiro")
@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public class BarbeiroFacade implements IBarbeiroFacade {
	
	@Inject
	private BarbeiroDao barbeiroDao;
	

	@Override
	@GET
	public List<Barbeiro> getBarbeiros() {
		return barbeiroDao.getBarbeiros();
	}
	
	
	@Override
	@GET
	@Path("/{codigo}")
	public Barbeiro getBarbeiroId(@PathParam(value="codigo") Long id) {
		return barbeiroDao.getBarbeiroId(id);
	}
	
	
	@Override
	@DELETE
	@Path("/{codigo}")
	public void excluirBarbeiro(@PathParam(value="codigo") Long id) {
		barbeiroDao.excluirBarbeiro(id);
	}
	

	@Override
	@POST
	public void salvarBarbeiro(Barbeiro barbeiro) {
		barbeiroDao.inserirBarbeiro(barbeiro);
	}
	
	
	@Override
	@PUT
	public void atualizarBarbeiro(Barbeiro barbeiro) {
		barbeiroDao.atualizarBarbeiro(barbeiro);
	}
	
}





