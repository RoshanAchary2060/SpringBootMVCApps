package com.rosan;

import java.beans.PropertyEditorSupport;
import java.time.LocalTime;

public class LocalTimeEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		// split the date value whose pattern is hh:mm
		String timeContent[] = text.split(":");
		int hours = Integer.parseInt(timeContent[0]);
		int minutes = Integer.parseInt(timeContent[1]);
		// create LocalTime class obj
		LocalTime lt = LocalTime.of(hours, minutes);
		// set value to property
		super.setValue(lt);
	}

}
