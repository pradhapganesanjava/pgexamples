package com.pg.mapstruct.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.pg.mapstruct.bo.Car;
import com.pg.mapstruct.bo.CarDto;
import com.pg.mapstruct.bo.CarFeature;
import com.pg.mapstruct.bo.CarFeatureDto;

@Mapper
public interface CarMapper {
	
	CarMapper INSTANCE = Mappers.getMapper( CarMapper.class );
	
	@Mappings({
		@Mapping(source = "carId", target="carObjId"),
		@Mapping(source = "carModel", target="carModelName")
	})
	public CarDto carToCarDto(Car car);

	/*@Mappings({
		@Mapping(source = "mileage", target="mileage"),
		@Mapping(source = "isSunroofed", target="sunRoofed"),
		@Mapping(source="dashBoard", target="dashBoard")
	})*/
	public List<CarFeatureDto> carFetureToCarFeatureDto(List<CarFeature> carFeature);
}
