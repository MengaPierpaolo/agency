package com.project.agency.formatter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class DateFormatter implements Formatter<Date> {
	
	private String format;

	@Override
	public String print(Date object, Locale locale) {
		return getDateFormat(locale).format(object);
	}

	@Override
	public Date parse(String text, Locale locale) throws ParseException {
		return getDateFormat(locale).parse(text);
	}
	
	public DateFormat getDateFormat(Locale locale) {
		if (StringUtils.hasText(format)) {
			return new SimpleDateFormat(format, locale);
		} else {
			return SimpleDateFormat.getDateInstance(SimpleDateFormat.MEDIUM, locale);
		}
	}

	public void setFormat(String format) {
		this.format = format;
	}	

}
