package com.mapstruct.poc.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.mapstruct.poc.domain.Car;
import com.mapstruct.poc.domain.CarDto;

@Mapper
public interface CarMapper {
    
    @Mappings({
        @Mapping(source="make", target="manufacturer"),
        @Mapping(source="numberOfSeats", target="seatCount")
    })
    CarDto carToCarDto(Car car);

}
