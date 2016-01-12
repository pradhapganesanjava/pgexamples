package com.pg.mapstruct.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.pg.mapstruct.bo.CarFeature;
import com.pg.mapstruct.bo.CarFeatureDto;

@Mapper
public interface CarFeatureMapper {
	
	CarFeatureMapper INSTANCE = Mappers.getMapper(CarFeatureMapper.class);
	
	@Mappings({
		@Mapping(source="modelFeature",target="modelFeature"),
		@Mapping(source="mileage", target="mileage"),
		@Mapping(source="sunroofed",target="sunRoofed"),
		@Mapping(source="dashBoard",target="dashBoard")		
	})
	public CarFeatureDto carFeatureTocarFeatureDto(CarFeature carFeature);
	
}
