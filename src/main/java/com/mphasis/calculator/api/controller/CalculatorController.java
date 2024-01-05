package com.mphasis.calculator.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.calculator.api.dto.CalculatorResponse;
import com.mphasis.calculator.api.service.CalculatorService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/calculator")
@RequiredArgsConstructor
public class CalculatorController {
	
	private final CalculatorService CalculatorService;
	
	@PostMapping("add")
	@ResponseStatus(value = HttpStatus.OK)
	public CalculatorResponse add(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
		return CalculatorResponse.builder().data(CalculatorService.add(a, b)).message(" Successfully Added.").build();
	}

	@PostMapping("substract")
	@ResponseStatus(value = HttpStatus.OK)
	public CalculatorResponse substract(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
		return CalculatorResponse.builder().data(CalculatorService.substract(a, b)).message(" Successfully substract done.").build();
	} 

}
