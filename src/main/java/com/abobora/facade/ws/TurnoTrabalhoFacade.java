package com.abobora.facade.ws;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.abobora.dao.TurnoTrabalhoDao;
import com.abobora.domain.TurnoTrabalho;
import com.abobora.facade.ITurnoTrabalhoFacade;


@WebService(serviceName="ws/turnoTrabalho")
public class TurnoTrabalhoFacade implements ITurnoTrabalhoFacade {
	
	@Inject
	private TurnoTrabalhoDao turnoTrabalhoDao;
	
	@Override
	@WebMethod
	public List<TurnoTrabalho> getTurnoTrabalhos() {
		return turnoTrabalhoDao.getTurnoTrabalhos();
	}
	
	@Override
	@WebMethod
	public TurnoTrabalho getTurnoTrabalhoId(@WebParam(name="id") Long id) {
		return turnoTrabalhoDao.getTurnoTrabalhoId(id);
	}
	
	@Override
	@WebMethod
	public void excluirTurnoTrabalho(@WebParam(name="id") Long id) {
		turnoTrabalhoDao.excluirTurnoTrabalho(id);
	}
	
	@Override
	@WebMethod
	public void salvarTurnoTrabalho(@WebParam(name="turnoTrabalho") TurnoTrabalho turnoTrabalho) {
		turnoTrabalhoDao.inserirTurnoTrabalho(turnoTrabalho);
	}
	
	@Override
	@WebMethod
	public void atualizarTurnoTrabalho(@WebParam(name="turnoTrabalho") TurnoTrabalho turnoTrabalho) {
		turnoTrabalhoDao.atualizarTurnoTrabalho(turnoTrabalho);
	}
	
}





