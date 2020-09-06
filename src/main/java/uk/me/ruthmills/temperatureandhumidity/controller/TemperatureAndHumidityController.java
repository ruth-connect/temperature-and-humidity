package uk.me.ruthmills.temperatureandhumidity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import uk.me.ruthmills.temperatureandhumidity.model.TemperatureAndHumidityBean;
import uk.me.ruthmills.temperatureandhumidity.service.TemperatureAndHumidityService;

@Controller
@RequestMapping("/")
public class TemperatureAndHumidityController {

	@Autowired
	private TemperatureAndHumidityService temperatureAndHumidityService;

	@RequestMapping(value = "/readTemperatureAndHumidity", method = RequestMethod.GET)
	public @ResponseBody TemperatureAndHumidityBean readTemperatureAndHumidity() {
		return temperatureAndHumidityService.readTemperatureAndHumidity();
	}
}
