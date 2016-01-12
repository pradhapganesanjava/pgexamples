package com.pg.mapstruct.bo;

public class CarFeature {

	private String modelFeature;
	private int mileage;
	private boolean isSunroofed;
	private String dashBoard;
	
	public CarFeature() {
	}

	public String getDashBoard() {
		return dashBoard;
	}

	public void setDashBoard(String dashBoard) {
		this.dashBoard = dashBoard;
	}

	public int getMileage() {
		return mileage;
	}

	public boolean isSunroofed() {
		return isSunroofed;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public void setSunroofed(boolean isSunroofed) {
		this.isSunroofed = isSunroofed;
	}

	public String getModelFeature() {
		return modelFeature;
	}

	public void setModelFeature(String modelFeature) {
		this.modelFeature = modelFeature;
	}
	
	
	
}
