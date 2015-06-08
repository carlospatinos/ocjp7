package com.kinettik.mx.logging;

import org.junit.Assert;
import org.junit.Test;

public class StringImmuttableTest {
	String s1 = "Original Value";
	String s2 = "Original Value";
	String s3 = "Other Value";
	String s4 = s3;
	String s5 = new String("Original Value");
	String s6 = new String("Original Value");
	String s7 = new String("Original Value").intern();
	String s8 = new String("Other Value");

	@Test
	public void testEquality() throws Exception {
		Assert.assertTrue(s1 == s2);
		Assert.assertTrue(s1.equals(s2));

		Assert.assertTrue(s1 != s3);
		Assert.assertTrue(!s1.equals(s3));

		Assert.assertTrue(s1 != s5);
		Assert.assertTrue(s1.equals(s5));

		Assert.assertTrue(s5 != s6);
		Assert.assertTrue(s5.equals(s6));

		Assert.assertTrue(s1 == s7);
		Assert.assertTrue(s5 != s7);

		Assert.assertTrue(s3 == s4);
		s3 = "Modified value";
		Assert.assertTrue(s3 != s4);
	}
}
