package com.cydeo.mapper;


import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.lang.reflect.Type;
//a generic mapping class
@Component
public class MapperUtil {

    private final ModelMapper modelMapper;

    public MapperUtil(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    // 2 possible methods to use
    public <T> T convert(Object objectToBeConverted, T convertedObject) {
        return modelMapper.map(objectToBeConverted, (Type) convertedObject.getClass());
    }

//    public <T> T convert(Object objectToBeConverted, Class<T> convertedObject) {
//        return modelMapper.map(objectToBeConverted, convertedObject);
//    }
}
