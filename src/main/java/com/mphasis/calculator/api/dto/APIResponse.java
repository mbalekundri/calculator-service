package com.mphasis.calculator.api.dto;

import java.io.Serializable;

public interface APIResponse<T> extends Serializable{
	
	T getData();
	
	String getMessage();
}
