package com.padraodeprojeto.bean.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import com.padraodeprojeto.bean.DateService;

public class DateServiceImpl implements DateService {

	@Override
	public long getDiferencaEmDias(String firstDate, String secondDate) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date auxFirstDate = sdf.parse(firstDate);
        Date auxSecondDate = sdf.parse(secondDate);

        long diff = auxSecondDate.getTime() - auxFirstDate.getTime();

        TimeUnit time = TimeUnit.DAYS; 
        long diferencaEmDias = time.convert(diff, TimeUnit.MILLISECONDS);
        
		return diferencaEmDias;
	}

}
