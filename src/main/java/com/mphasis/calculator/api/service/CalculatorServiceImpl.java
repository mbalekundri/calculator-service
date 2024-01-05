package com.mphasis.calculator.api.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

	@Override
	public Integer add(Integer a, Integer b) {
		return a + b;
	}

	@Override
	public Integer substract(Integer a, Integer b) {
		return a - b;
	}

}
