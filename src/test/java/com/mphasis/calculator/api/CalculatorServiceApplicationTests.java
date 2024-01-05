package com.mphasis.calculator.api;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mphasis.calculator.api.controller.CalculatorController;

@SpringBootTest
class CalculatorServiceApplicationTests {

	@Autowired
	private CalculatorController calculatorController;

	@Test
	void contextLoads() {
		assertNotNull(calculatorController);
	}

}
