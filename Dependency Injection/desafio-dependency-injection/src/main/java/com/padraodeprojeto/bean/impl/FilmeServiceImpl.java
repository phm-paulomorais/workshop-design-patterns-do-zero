package com.padraodeprojeto.bean.impl;

import java.util.Calendar;
import java.util.Date;
import javax.inject.Inject;

import com.padraodeprojeto.bean.DateService;
import com.padraodeprojeto.bean.FilmeRepository;
import com.padraodeprojeto.bean.FilmeService;
import com.padraodeprojeto.enums.Tipo;
import com.padraodeprojeto.model.Filme;

public class FilmeServiceImpl implements FilmeService{

	@Inject
	private FilmeRepository filmeRepository;
	
	@Inject
	private DateService dateService;
	
	@Override
	public void salvar(Filme filme) {
		Date dataDeLancamento = filme.getDataDeLancamento();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataDeLancamento);
		String auxDataDeLancamento = calendar.get(Calendar.DAY_OF_MONTH) + "/" + (calendar.get(Calendar.MONTH) +1) + "/" + calendar.get(Calendar.YEAR); 
		System.out.println("Data de lancamento: " + auxDataDeLancamento);
		
		calendar.setTime(new Date());
		String todayDate = calendar.get(Calendar.DAY_OF_MONTH) + "/" + (calendar.get(Calendar.MONTH) +1) + "/" + calendar.get(Calendar.YEAR);
		System.out.println("Data de hoje: " + todayDate);
		
		long diferencaEmDiasEntreDatas;
		try {
			diferencaEmDiasEntreDatas = dateService.getDiferencaEmDias(auxDataDeLancamento, todayDate);
			
			if (diferencaEmDiasEntreDatas > 90) {
				filme.setTipo(Tipo.ANTIGO); 
			} else {
				filme.setTipo(Tipo.NOVO);
			}
			
			filmeRepository.salvar(filme);
		} catch (Exception e) {
			System.out.println("Ocorreu um erro ao salvar o filme");
		}
		
	}
	

}
