package com.abobora.facade;

import java.util.List;

import com.abobora.domain.ExecucaoServico;

public interface IExecucaoServicoFacade {

	List<ExecucaoServico> getExecucaoServicos();

	ExecucaoServico getExecucaoServicoId(Long id);

	void excluirExecucaoServico(Long id);

	void salvarExecucaoServico(ExecucaoServico execucaoServico);

	void atualizarExecucaoServico(ExecucaoServico execucaoServico);

}