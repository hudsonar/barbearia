package com.abobora.facade;

import java.util.List;

import com.abobora.domain.Barbeiro;

public interface IBarbeiroFacade {

	List<Barbeiro> getBarbeiros();

	Barbeiro getBarbeiroId(Long id);

	void excluirBarbeiro(Long id);

	void salvarBarbeiro(Barbeiro barbeiro);

	void atualizarBarbeiro(Barbeiro barbeiro);

}