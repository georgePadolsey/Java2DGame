package com.padolsey.george.javagame;

/**
 * <p/>
 * Latest Change:
 * <p/>
 *
 * @author George
 * @since 01/05/2014
 */
public class Messages {
	public static String _(String message) {
		return Game.getProperties().getProperty(message);
	}
}
