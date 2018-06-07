package com.abobora.facade.ws;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.abobora.dao.ServicoDao;
import com.abobora.domain.Servico;
import com.abobora.facade.IServicoFacade;


@WebService(serviceName="ws/servico")
public class ServicoFacade implements IServicoFacade {
	
	@Inject
	private ServicoDao servicoDao;
	
	@Override
	@WebMethod
	public List<Servico> getServicos() {
		return servicoDao.getServicos();
	}
	
	@Override
	@WebMethod
	public Servico getServicoId(@WebParam(name="id") Long id) {
		return servicoDao.getServicoId(id);
	}
	
	@Override
	@WebMethod
	public void excluirServico(@WebParam(name="id") Long id) {
		servicoDao.excluirServico(id);
	}
	
	@Override
	@WebMethod
	public void salvarServico(@WebParam(name="servico") Servico servico) {
		servicoDao.inserirServico(servico);
	}
	
	@Override
	@WebMethod
	public void atualizarServico(@WebParam(name="servico") Servico servico) {
		servicoDao.atualizarServico(servico);
	}
	
}





