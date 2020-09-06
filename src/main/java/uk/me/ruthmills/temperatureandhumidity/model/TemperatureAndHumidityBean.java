package uk.me.ruthmills.temperatureandhumidity.model;

import java.math.BigDecimal;

public class TemperatureAndHumidityBean {

	private BigDecimal temperature;
	private BigDecimal humidity;

	public BigDecimal getTemperature() {
		return temperature;
	}

	public void setTemperature(BigDecimal temperature) {
		this.temperature = temperature;
	}

	public BigDecimal getHumidity() {
		return humidity;
	}

	public void setHumidity(BigDecimal humidity) {
		this.humidity = humidity;
	}
}
