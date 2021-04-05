/**
 * 
 */
package com.fan.main;

import com.fan.Fan;

/**
 * @author anirb.das
 *
 */
public class FanTestDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Fan fan = new Fan();
		/**
		 * Starting the fan in forward direction
		 */
		System.out.println("Pulling the Chain");
		fan.pull();
		System.out.println(fan.toString());
		/**
		 * Pulling the chain in forward direction
		 */
		System.out.println("Pulling the Chain");
		fan.pull();
		System.out.println(fan.toString());
		/**
		 * Reversing to backward direction
		 */
		System.out.println("Reversing the Direction");
		fan.reverse();
		System.out.println(fan.toString());
		/**
		 * Pulling the chain in backward direction
		 */
		System.out.println("Pulling the Chain");
		fan.pull();
		System.out.println(fan.toString());
		/**
		 * Reversing to forward direction
		 */
		System.out.println("Reversing the Direction");
		fan.reverse();
		System.out.println(fan.toString());
	}

}
