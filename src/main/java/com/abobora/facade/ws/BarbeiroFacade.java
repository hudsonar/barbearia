package com.abobora.facade.ws;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.abobora.dao.BarbeiroDao;
import com.abobora.domain.Barbeiro;
import com.abobora.facade.IBarbeiroFacade;

@WebService(serviceName="ws/barbeiro")
public class BarbeiroFacade implements IBarbeiroFacade {
	
	@Inject
	private BarbeiroDao barbeiroDao;
	
	@Override
	@WebMethod
	public List<Barbeiro> getBarbeiros() {
		return barbeiroDao.getBarbeiros();
	}
	@Override
	@WebMethod
	public Barbeiro getBarbeiroId(@WebParam(name="id") Long id) {
		return barbeiroDao.getBarbeiroId(id);
	}
	@Override
	@WebMethod
	public void excluirBarbeiro(@WebParam(name="id") Long id) {
		barbeiroDao.excluirBarbeiro(id);
	}
	
	@Override
	@WebMethod
	public void salvarBarbeiro(@WebParam(name="barbeiro") Barbeiro barbeiro) {
		barbeiroDao.inserirBarbeiro(barbeiro);
	}
	@Override
	@WebMethod
	public void atualizarBarbeiro(@WebParam(name="barbeiro") Barbeiro barbeiro) {
		barbeiroDao.atualizarBarbeiro(barbeiro);
	}
}





