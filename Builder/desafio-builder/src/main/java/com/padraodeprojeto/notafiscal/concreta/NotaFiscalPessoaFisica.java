package com.padraodeprojeto.notafiscal.concreta;

import com.padraodeprojeto.model.NotaFiscal;

public class NotaFiscalPessoaFisica extends NotaFiscal {

	@Override
	public Double getImposto() {
		return 7.0/100;
	}

}
