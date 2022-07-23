package com.chainsys.bestPractices.sam;

import java.util.ArrayList;

// SAM - Single Abstract Method
//@FunctionalInterface
interface IntegerFunction {
	Integer doOperations(int x, int y);
//	boolean summa(boolean condition);
}

interface StringFunction {
	String execute(String s);
}

interface NumberFunction {
	Integer doOperations(int x, int y, int z);
}

class ImplementerA implements IntegerFunction {

	@Override
	public Integer doOperations(int x, int y) {
		return x + y;
	}
}

public class SamLessons {
	public static void demoA() {
		IntegerFunction total = new ImplementerA();
		IntegerFunction add = (x, y) -> x + y; // Lambda expression
		// (x+y) is parameters for the method
		// -> x+y is the implementation for the method
		// add is an implementation of doOperations method of interface IntegerFunction
		NumberFunction sum = (x, y, z) -> x + y + z;
		Integer result = sum.doOperations(2, 3, 4);
		System.out.println("Result : " + result);
		IntegerFunction multiply = (x, y) -> x * y;
		IntegerFunction divide = (x, y) -> x / y;
		result = add.doOperations(2, 3);
		System.out.println("Result : " + result);
		result = total.doOperations(2, 3);
		System.out.println("Result : " + result);
		result = multiply.doOperations(3, 4);
		System.out.println("Result : " + result);
		result = divide.doOperations(8, 4);
		System.out.println("Result : " + result);
		System.out.println(add.getClass().getName());
	}

	public static void demoB() {
		StringFunction upper = (s) -> s.toUpperCase();
		StringFunction lower = (s) -> s.toLowerCase();
		String result = upper.execute("Naveen");
		System.out.println("Result : " + result);
		result = lower.execute("Naveen");
		System.out.println("Result : " + result);
	}

	public static void demoC() {
		ArrayList<Integer> nos = new ArrayList<Integer>();
		nos.add(100);
		nos.add(20);
		nos.add(30);
		nos.add(25);
		nos.add(80);
		nos.forEach((n) -> System.out.println(n));
		// Single line statements
	}

	public static void demoD() {
		IntegerFunction getTotal = (x, y) -> x + y;
		ArrayList<Integer> nos = new ArrayList<Integer>();
		nos.add(100);
		nos.add(20);
		nos.add(30);
		nos.add(25);
		nos.add(80);
		int i = 100;
		nos.forEach((n) -> {
			int result = 0;
			result = getTotal.doOperations(n, i);
			System.out.println(" total: " + result);
		});
		// Multi line statements
	}
}
