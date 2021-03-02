package com.example.demo;

public class Model_weather {
	
	private int id;
	private String city_name;
	private String desc;
	private String icon;
	private int temperature;
	private int pressure;
	private int humidity;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	public int getPressure() {
		return pressure;
	}
	public void setPressure(int pressure) {
		this.pressure = pressure;
	}
	public int getHumidity() {
		return humidity;
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	@Override
	public String toString() {
		return "Model_weather [id=" + id + ", city_name=" + city_name + ", desc=" + desc + ", icon=" + icon
				+ ", temperature=" + temperature + ", pressure=" + pressure + ", humidity=" + humidity + "]";
	}
	
	

}
