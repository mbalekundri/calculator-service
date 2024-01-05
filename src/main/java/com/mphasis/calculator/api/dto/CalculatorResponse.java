package com.mphasis.calculator.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CalculatorResponse implements APIResponse<Integer> {

	private static final long serialVersionUID = 1L;

	private Integer data;
	private String message;

	@Override
	public Integer getData() {
		return this.data;
	}

	@Override
	public String getMessage() {
		return this.message;
	}

}
