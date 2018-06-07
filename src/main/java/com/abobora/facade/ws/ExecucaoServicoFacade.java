package com.abobora.facade.ws;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.abobora.dao.ExecucaoServicoDao;
import com.abobora.domain.ExecucaoServico;
import com.abobora.facade.IExecucaoServicoFacade;


@WebService(serviceName="ws/execucaoServico")
public class ExecucaoServicoFacade implements IExecucaoServicoFacade {
	
	@Inject
	private ExecucaoServicoDao execucaoServicoDao;
	
	@Override
	@WebMethod
	public List<ExecucaoServico> getExecucaoServicos() {
		return execucaoServicoDao.getExecucaoServicos();
	}
	
	@Override
	@WebMethod
	public ExecucaoServico getExecucaoServicoId(@WebParam(name="id") Long id) {
		return execucaoServicoDao.getExecucaoServicoId(id);
	}
	
	@Override
	@WebMethod
	public void excluirExecucaoServico(@WebParam(name="id") Long id) {
		execucaoServicoDao.excluirExecucaoServico(id);
	}
	
	@Override
	@WebMethod
	public void salvarExecucaoServico(@WebParam(name="execucaoServico") ExecucaoServico execucaoServico) {
		execucaoServicoDao.inserirExecucaoServico(execucaoServico);
	}
	
	@Override
	@WebMethod
	public void atualizarExecucaoServico(@WebParam(name="execucaoServico") ExecucaoServico execucaoServico) {
		execucaoServicoDao.atualizarExecucaoServico(execucaoServico);
	}
	
}





