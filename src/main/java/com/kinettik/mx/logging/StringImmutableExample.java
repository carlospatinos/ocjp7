package com.kinettik.mx.logging;

public class StringImmutableExample {
	public static void main(final String... args) {
		final String s1 = "Original Value";
		final String s2 = "Original Value";
		final String s3 = "Other Value";
		final String s4 = new String("Original Value");
		final String s5 = new String("Original Value");
		final String s6 = new String("Original Value").intern();
		final String s7 = new String("Other Value");
	}
}
