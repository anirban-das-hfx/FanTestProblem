/**
 * 
 */
package com.fan;

/**
 * Fan class
 * 
 * @author anirb.das
 *
 */
public class Fan {

	/** States of the fan */
	public enum FanSpeed {
		OFF(0), LOW(1), MEDIUM(2), HIGH(3);

		private final int speed;

		FanSpeed(int speed) {
			this.speed = speed;
		}

		public int getSpeed() {
			return speed;
		}

	}

	/** Variables to store state and direction of the fan */
	private int speed; 
	private boolean direction;

	/** Setting the initial state of the fan to off and the direction to forward */
	public Fan() {
		speed = FanSpeed.OFF.getSpeed();
		direction = true;
	}

	/**
	 * Logic to change the speed of the fan whenever pull is invoked.
	 */
	public void pull() {
		speed = speed == FanSpeed.HIGH.getSpeed() ? FanSpeed.OFF.getSpeed() : ++speed;
	}

	/**
	 * Logic to change the direction of the fan whenever reverse is invoked.
	 */
	public void reverse() {
		direction = !direction;
	}

	public int getSpeed() {
		return speed;
	}

	public boolean getDirection() {
		return direction;
	}

	public String toString() {
		return "Fan is at " + getSpeed() + "  in " + getDirection() + " direction";

	}
}
