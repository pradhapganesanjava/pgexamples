package com.pg.mapstruct.bo;

import java.util.List;

public class CarDto {

	private Long carObjId;
	private String carModelName;
	private List<CarFeature> carFeatures;
	
	public CarDto() {}

	public Long getCarObjId() {
		return carObjId;
	}

	public String getCarModelName() {
		return carModelName;
	}

	public List<CarFeature> getCarFeatures() {
		return carFeatures;
	}

	public void setCarObjId(Long carObjId) {
		this.carObjId = carObjId;
	}

	public void setCarModelName(String carModelName) {
		this.carModelName = carModelName;
	}

	public void setCarFeatures(List<CarFeature> carFeatures) {
		this.carFeatures = carFeatures;
	}
	
	
}
