package com.pg.mapstruct.client;

import java.util.ArrayList;
import java.util.List;

import com.pg.mapstruct.bo.Car;
import com.pg.mapstruct.bo.CarDto;
import com.pg.mapstruct.bo.CarFeature;
import com.pg.mapstruct.mapper.CarMapper;

public class CarMapperClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	Car carObj = populateCar();
	
	CarDto carDto = CarMapper.INSTANCE.carToCarDto(carObj);
	
	if(null != carDto){
		System.out.println( carDto.getCarObjId());
	}
	
		
	}

	private static Car populateCar() {
		Car carObj  = new Car();
			carObj.setCarId(1000l);
			carObj.setCarModel("Camry");
		CarFeature carFeature = new CarFeature();
			carFeature.setModelFeature("LE");
			carFeature.setDashBoard("Manual");
			carFeature.setMileage(25);
			carFeature.setSunroofed(false);
		
		CarFeature carFeature2 = new CarFeature();
			carFeature2.setModelFeature("SE");
			carFeature2.setDashBoard("Digital");
			carFeature2.setMileage(20);
			carFeature2.setSunroofed(true);
		
		List<CarFeature> carFeatures = new ArrayList<CarFeature>();
		carFeatures.add(carFeature);
		carFeatures.add(carFeature2);
		
		carObj.setCarFeatures(carFeatures);
		
		return carObj;
	}
}
