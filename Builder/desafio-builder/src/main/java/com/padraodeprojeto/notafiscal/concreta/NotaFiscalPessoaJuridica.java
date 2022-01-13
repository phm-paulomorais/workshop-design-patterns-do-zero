package com.padraodeprojeto.notafiscal.concreta;

import com.padraodeprojeto.model.NotaFiscal;

public class NotaFiscalPessoaJuridica extends NotaFiscal {

	@Override
	public Double getImposto() {
		return 4.0/100;
	}

}
