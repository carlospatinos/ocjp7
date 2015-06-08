package com.kinettik.mx.logging;

public class StringExample {
	public static void main(final String[] args) {
		final String str1 = "Abc" + "1";
		final String str2 = "Ab" + "c1";
		final String str3 = new String("Ab" + "c1");

		if (str1 == str2) {
			System.out.println("Strings 1 and 2 are same");
		}
		if (str2 == str3) {
			System.out.println("Strings 2 and 3 are same");
		}
		if (str2.equals(str3)) {
			System.out.println("Strings 2 and 3 are equals");
		}
	}
}
