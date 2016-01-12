package com.pg.mapstruct.bo;

public class CarFeatureDto {

	private String modelFeature;
	private Integer mileage;
	private boolean sunRoofed;
	private String dashBoard;

	public CarFeatureDto() {
	}

	public Integer getMileage() {
		return mileage;
	}

	public boolean isSunRoofed() {
		return sunRoofed;
	}

	public String getDashBoard() {
		return dashBoard;
	}

	public void setMileage(Integer mileage) {
		this.mileage = mileage;
	}

	public void setSunRoofed(boolean sunRoofed) {
		this.sunRoofed = sunRoofed;
	}

	public void setDashBoard(String dashBoard) {
		this.dashBoard = dashBoard;
	}

	public String getModelFeature() {
		return modelFeature;
	}

	public void setModelFeature(String modelFeature) {
		this.modelFeature = modelFeature;
	}

	
}
