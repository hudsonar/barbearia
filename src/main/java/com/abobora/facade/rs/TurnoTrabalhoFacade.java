package com.abobora.facade.rs;

import java.util.ArrayList;
import java.util.Date;
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

import com.abobora.dao.TurnoTrabalhoDao;
import com.abobora.domain.TurnoTrabalho;
import com.abobora.facade.ITurnoTrabalhoFacade;

@Path(value="/turnoTrabalho")
@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Produces({MediaType.APPLICATION_JSON})
public class TurnoTrabalhoFacade implements ITurnoTrabalhoFacade {
	
	@Inject
	private TurnoTrabalhoDao turnoTrabalhoDao;
	
	@Override
	@GET
	public List<TurnoTrabalho> getTurnoTrabalhos() {
		List<TurnoTrabalho> lista = new ArrayList<TurnoTrabalho>();
		lista.add(new TurnoTrabalho(1l, new Date(), new Date(), "SEGUNDA,TERÇA,QUARTA,QUINTA,SEXTA"));
		return lista;
		//return turnoTrabalhoDao.getTurnoTrabalhos();
	}
	
	@Override
	@GET
	@Path("/{id}")
	public TurnoTrabalho getTurnoTrabalhoId(@PathParam(value="id") Long id) {
		return turnoTrabalhoDao.getTurnoTrabalhoId(id);
	}
	
	@Override
	@DELETE
	@Path("/{id}")
	public void excluirTurnoTrabalho(@PathParam(value="id") Long id) {
		turnoTrabalhoDao.excluirTurnoTrabalho(id);
	}
	
	@Override
	@POST
	public void salvarTurnoTrabalho(TurnoTrabalho turnoTrabalho) {
		turnoTrabalhoDao.inserirTurnoTrabalho(turnoTrabalho);
	}
	
	@Override
	@PUT
	public void atualizarTurnoTrabalho(TurnoTrabalho turnoTrabalho) {
		turnoTrabalhoDao.atualizarTurnoTrabalho(turnoTrabalho);
	}
	
}





