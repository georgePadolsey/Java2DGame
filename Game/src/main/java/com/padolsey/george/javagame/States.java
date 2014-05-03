package com.padolsey.george.javagame;

/**
 * <p/>
 * Latest Change:
 * <p/>
 *
 * @author George
 * @since 01/05/2014
 */
public enum States {
	MAIN_MENU(0),
	NULL(null);

	private final Integer integer;

	States(Integer integer) {
		this.integer = integer;
	}

	public Integer getId() {
		return integer;
	}
}
