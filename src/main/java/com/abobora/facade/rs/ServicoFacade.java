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

import com.abobora.dao.ServicoDao;
import com.abobora.domain.Servico;
import com.abobora.facade.IServicoFacade;

@Path(value="/servico")
@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public class ServicoFacade implements IServicoFacade {
	
	@Inject
	private ServicoDao servicoDao;
	
	@Override
	@GET
	public List<Servico> getServicos() {
		return servicoDao.getServicos();
	}
	
	@Override
	@GET
	@Path("/{codigo}")
	public Servico getServicoId(@PathParam(value="codigo") Long id) {
		return servicoDao.getServicoId(id);
	}
	
	@Override
	@DELETE
	@Path("/{codigo}")
	public void excluirServico(@PathParam(value="codigo") Long id) {
		servicoDao.excluirServico(id);
	}
	
	@Override
	@POST
	public void salvarServico(Servico servico) {
		servicoDao.inserirServico(servico);
	}
	
	@Override
	@PUT
	public void atualizarServico(Servico servico) {
		servicoDao.atualizarServico(servico);
	}
	
}





