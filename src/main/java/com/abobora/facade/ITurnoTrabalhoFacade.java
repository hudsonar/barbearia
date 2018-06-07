package com.abobora.facade;

import java.util.List;

import com.abobora.domain.TurnoTrabalho;

public interface ITurnoTrabalhoFacade {

	List<TurnoTrabalho> getTurnoTrabalhos();

	TurnoTrabalho getTurnoTrabalhoId(Long id);

	void excluirTurnoTrabalho(Long id);

	void salvarTurnoTrabalho(TurnoTrabalho turnoTrabalho);

	void atualizarTurnoTrabalho(TurnoTrabalho turnoTrabalho);

}