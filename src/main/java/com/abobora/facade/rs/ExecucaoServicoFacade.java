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

import com.abobora.dao.ExecucaoServicoDao;
import com.abobora.domain.ExecucaoServico;
import com.abobora.facade.IExecucaoServicoFacade;

@Path(value="/execucaoServico")
@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public class ExecucaoServicoFacade implements IExecucaoServicoFacade {
	
	@Inject
	private ExecucaoServicoDao execucaoServicoDao;
	
	@Override
	@GET
	public List<ExecucaoServico> getExecucaoServicos() {
		return execucaoServicoDao.getExecucaoServicos();
	}
	
	@Override
	@GET
	@Path("/{codigo}")
	public ExecucaoServico getExecucaoServicoId(@PathParam(value="codigo") Long id) {
		return execucaoServicoDao.getExecucaoServicoId(id);
	}
	
	@Override
	@DELETE
	@Path("/{codigo}")
	public void excluirExecucaoServico(@PathParam(value="codigo") Long id) {
		execucaoServicoDao.excluirExecucaoServico(id);
	}
	
	@Override
	@POST
	public void salvarExecucaoServico(ExecucaoServico execucaoServico) {
		execucaoServicoDao.inserirExecucaoServico(execucaoServico);
	}
	
	@Override
	@PUT
	public void atualizarExecucaoServico(ExecucaoServico execucaoServico) {
		execucaoServicoDao.atualizarExecucaoServico(execucaoServico);
	}
	
}





