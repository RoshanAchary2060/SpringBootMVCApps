package com.rosan;

import java.beans.PropertyEditorSupport;
import java.time.LocalDate;

public class LocalDateEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		// split the date value whose pattern is yyyy-MM-dd
		String dateContent[] = text.split("-");
		int year = Integer.parseInt(dateContent[0]);
		int month = Integer.parseInt(dateContent[1]);
		int day = Integer.parseInt(dateContent[2]);
		// create LocalDate class obj
		LocalDate ldt = LocalDate.of(year, month, day);
		// set value to property
		super.setValue(ldt);
	}

}
