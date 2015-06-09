package com.kinettik.mx.comparison;

public class BooleanExmaple {
	public static void main(final String[] args) {
		System.out.println("-->" + System.getProperty("JVM_USE_TNK_RESOLVER"));
		boolean p = false;
		p = Boolean.parseBoolean(System.getProperty("JVM_USE_TNK_RESOLVER",
				"true"));
		System.out.println(p);
	}
}
