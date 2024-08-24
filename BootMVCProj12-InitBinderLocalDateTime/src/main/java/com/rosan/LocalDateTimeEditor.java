package com.rosan;

import java.beans.PropertyEditorSupport;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		// split the date value whose pattern is yyyy-MM-ddThh:mm
		String content[] = text.split("T");
		String dateContent[] = content[0].split("-");
		String timeContent[] = content[1].split(":");
		int hours = Integer.parseInt(timeContent[0]);
		int minutes = Integer.parseInt(timeContent[1]);
		int year = Integer.parseInt(dateContent[0]);
		int month = Integer.parseInt(dateContent[1]);
		int day = Integer.parseInt(dateContent[2]);
		// create LocalDateTime class obj
		LocalDateTime ldt = LocalDateTime.of(year, month, day, hours, minutes);
		super.setValue(ldt);
	}

}
