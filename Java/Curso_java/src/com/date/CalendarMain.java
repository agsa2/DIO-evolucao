package com.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class CalendarMain {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		//mudar data
		Calendar cal = Calendar.getInstance();
		cal.setTime(d); //estanciar d no calendario
		cal.add(Calendar.HOUR_OF_DAY, 4); // data + 4
		d = cal.getTime(); //atualizar Date d com o valor de cal
		
		System.out.println(sdf.format(d));
		
		//Obter unidade de tempo
		
		int minutes = cal.get(Calendar.MINUTE);
		int month   = 1 + cal.get(Calendar.MONTH); //começa a contar do 0
		System.out.println("minutes: " + minutes);
		System.out.println("month: " + month);

	}

}
