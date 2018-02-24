package com.nour.calculator;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class Calculator {
	@Cacheable("sum")
	public int sum(int a, int b) {
		return a + b;
	}
}
