package com.abobora.facade;

import java.util.List;

import com.abobora.domain.Servico;

public interface IServicoFacade {

	List<Servico> getServicos();

	Servico getServicoId(Long id);

	void excluirServico(Long id);

	void salvarServico(Servico cervico);

	void atualizarServico(Servico cervico);

}