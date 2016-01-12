package com.pg.mapstruct.bo;

import java.util.List;

public class Car {

	private Long carId;
	private String carModel;
	private List<CarFeature> carFeatures;
	
	public Car() {}
	
	public List<CarFeature> getCarFeatures() {
		return carFeatures;
	}
	public void setCarFeatures(List<CarFeature> carFeatures) {
		this.carFeatures = carFeatures;
	}

	public Long getCarId() {
		return carId;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarId(Long carId) {
		this.carId = carId;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	
	
	
	
}
