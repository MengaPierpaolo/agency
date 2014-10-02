package com.project.agency.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import com.project.agency.domain.City;
import com.project.agency.service.CityService;

/**
 * Utilizado para desplegar en un form:select al objeto como una cadena
 * de texto y que al ser enviado al controlador pase como objeto nuevamente
 * en lugar de un valor nulo.
 * 
 * Debe configurarse su uso en el archivo /WEB-INF/spring/servlet-context.xml
 */
@Component
public class CityFormatter implements Formatter<City> {
	
	@Autowired
	private CityService cityService;

	@Override
	public String print(City city, Locale locale) {
		return city.getDestinyName();
	}

	@Override
	public City parse(String cityId, Locale locale) throws ParseException {
		return cityService.getCity(Long.parseLong(cityId, 10));
	}

}
