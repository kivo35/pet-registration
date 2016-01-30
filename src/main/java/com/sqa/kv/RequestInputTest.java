/**
 * 
 */
package com.sqa.kv;

import static org.junit.Assert.fail;

import java.util.Arrays;

import org.junit.Ignore;
import org.junit.Test;

import com.sqa.kv.util.helper.RequestInput;

/**
 * @author Kirill
 * 
 */
public class RequestInputTest
{

	/**
	 * Test method for
	 * {@link com.sqa.kv.util.helper.RequestInput#addStringElement(java.lang.String[], java.lang.String)}
	 * .
	 */
	@Test
	@Ignore
	public void testAddStringElement()
	{
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link com.sqa.kv.util.helper.RequestInput#getBoolean(java.lang.String)}.
	 */
	@Test
	@Ignore
	public void testGetBoolean()
	{
		boolean value = RequestInput.getBoolean("Are you learing anything today?: ");
		System.out.println("The asnwer is " + value);
	}

	/**
	 * Test method for
	 * {@link com.sqa.kv.util.helper.RequestInput#getChar(java.lang.String)}.
	 */
	@Test
	@Ignore
	public void testGetCharString()
	{
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link com.sqa.kv.util.helper.RequestInput#getChar(java.lang.String, char[])}
	 * .
	 */
	@Test
	@Ignore
	public void testGetCharStringCharArray()
	{
		char c = RequestInput.getChar("Give me a character:", 'M', 'F', 'f', 'm');
		System.out.println("Char is " + c);
	}

	/**
	 * Test method for
	 * {@link com.sqa.kv.util.helper.RequestInput#getDouble(java.lang.String)}.
	 */
	@Test
	@Ignore
	public void testGetDouble()
	{
		double value = RequestInput.getDouble("how much cash do you have on hand?: ");
		System.out.println("The amount is: " + value);
	}

	/**
	 * Test method for
	 * {@link com.sqa.kv.util.helper.RequestInput#getInt(java.lang.String)}.
	 */
	@Test
	@Ignore
	public void testGetInt()
	{
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link com.sqa.kv.util.helper.RequestInput#getString(java.lang.String)}.
	 */
	@Test
	@Ignore
	public void testGetStringString()
	{
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link com.sqa.kv.util.helper.RequestInput#getString(java.lang.String, java.lang.String[])}
	 * .
	 */
	@Test
	@Ignore
	public void testGetStringStringArray()
	{
		String[] myElements = new String[] { "baseball", "soccer ball", "foot ball", "tennis ball" };
		String[] myNewElements = RequestInput.addStringElement(myElements, "racket ball");
		System.out.println("Old Elements " + Arrays.toString(myElements));
		System.out.println("New Elements " + Arrays.toString(myNewElements));
	}

}
