/**
 * 
 */
package com.fan.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import com.fan.Fan;
import com.fan.Fan.FanSpeed;

/**
 * @author anirb.das
 *
 */
class FanTest {

	private final Fan fanImpl = new Fan();

	/**
	 * Test the Fan speed with pull method
	 */
	@Test
	void testFanPull() {
		fanImpl.pull();
		assertTrue(fanImpl.getSpeed()==FanSpeed.LOW.getSpeed());
		fanImpl.pull();
		assertTrue(fanImpl.getSpeed()==FanSpeed.MEDIUM.getSpeed());
		fanImpl.pull();
		assertTrue(fanImpl.getSpeed()==FanSpeed.HIGH.getSpeed());
		fanImpl.pull();
		assertTrue(fanImpl.getSpeed()==FanSpeed.OFF.getSpeed());
		
	}

	/**
	 * Test the Fan direction with reverse method
	 */
	@Test
	void testFanDirection() {
		assertTrue(fanImpl.getDirection());
		fanImpl.reverse();
		assertFalse(fanImpl.getDirection());
	}
}
