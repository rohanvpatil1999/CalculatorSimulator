package com.hefshine.Calculator.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hefshine.Calculator.Model.Calculator;

@RestController
@CrossOrigin(value = "http://localhost:4200/")
public class CalculatorController {

	
	@PostMapping("add")
	public int addition(@RequestBody Calculator calculator)
	{
		return calculator.getNum1()+calculator.getNum2();
	}
	
	@PostMapping("sub")
	public int substraction(@RequestBody Calculator calculator)
	{
		return calculator.getNum1()-calculator.getNum2();
	}
	
	@PostMapping("mult")
	public int multiplication(@RequestBody Calculator calculator)
	{
		return calculator.getNum1()*calculator.getNum2();
	}
	
	@PostMapping("div")
	public int division(@RequestBody Calculator calculator)
	{
		return calculator.getNum1()/calculator.getNum2();
	}
}
