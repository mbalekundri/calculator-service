package com.mphasis.calculatorapi;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mphasis.calculator.api.controller.CalculatorController;

@SpringBootTest
class CalculatorAwsPipeline1ApplicationTests {
	
	@Autowired
	private CalculatorController calculatorController;

	@Test
	void contextLoads() {
		assertNotNull(calculatorController);
	}

}
