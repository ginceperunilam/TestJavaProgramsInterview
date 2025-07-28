package com.JavaProjects.TestProjects;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateFunctionTest
{
	public void printDateFormats()
	{
//				YYYY-MM-DD

//				System.out.println(new LocalDate().format (DateTimeFormatter.ISO_LOCAL_DATE));--wrong
				System.out.println(LocalDate.now().format (DateTimeFormatter.ISO_LOCAL_DATE));

				System.out.println(DateFormat.getDateInstance (DateFormat.SHORT).format(new Date()));//MM/DD/YY

				System.out.println(LocalDate.now().format (DateTimeFormatter.ISO_LOCAL_DATE));//YYYY-MM-DD

				System.out.println(DateFormat.getDateInstance().toString());//string representation of the DateFormat instance

				System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));//YYYY-MM-DD
	}
}
