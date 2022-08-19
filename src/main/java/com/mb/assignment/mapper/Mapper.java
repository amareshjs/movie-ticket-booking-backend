package com.mb.assignment.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.mb.assignment.exception.CustomException;
import com.mb.assignment.exception.ErrorCode;

@Component
public class Mapper {

	public <T> T convert(Object srcObj, Class<T> targetClass) {
		T response = null;

		try {
			response = new ModelMapper().map(srcObj, targetClass);
		} catch (Exception e) {
			throw new CustomException("Error while converting object", e, ErrorCode.INTERNAL_SERVER_ERROR);
		}
		return response;
	}

}