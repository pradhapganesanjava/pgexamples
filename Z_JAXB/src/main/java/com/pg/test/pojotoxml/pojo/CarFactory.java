package com.pg.test.pojotoxml.pojo;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="CarFactory")
@XmlAccessorType (XmlAccessType.FIELD)
//@XmlType(name="CarFactory",propOrder={"factoryName","car"})
public class CarFactory implements Serializable{

	@XmlElement(name="car")
	private List<Car> carLst = null;
	private String factoryName = null;

	public CarFactory() {
	}

	public CarFactory(String factoryName, List<Car> carLst) {
		this.factoryName = factoryName;
		this.carLst = carLst;
	}

	public List<Car> getCarLst() {
		return carLst;
	}

	public String getFactoryName() {
		return factoryName;
	}

	public void setCarLst(List<Car> carLst) {
		this.carLst = carLst;
	}

	public void setFactoryName(String factoryName) {
		this.factoryName = factoryName;
	}

}
