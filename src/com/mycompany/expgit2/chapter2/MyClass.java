/**
 * 
 */
package com.mycompany.expgit2.chapter2;

/**
 * @author MaryBeth
 *
 */
public class MyClass {

	private String name;
	private String lastName;
	
	public MyClass(String name)
	{
		this.name = name;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		staticMethod("MaryBeth");
	}

	public static void staticMethod(String inp)
	{
		System.out.println("Hi input is " + inp);
	}
}
