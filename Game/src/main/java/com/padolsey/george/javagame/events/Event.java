package com.padolsey.george.javagame.events;

import lombok.NoArgsConstructor;

/**
 * <p/>
 * Latest Change:
 * <p/>
 *
 * @author George
 * @since 03/05/2014
 */
@NoArgsConstructor
public abstract class Event {

	private String name;

	public String getEventName() {
		if(name == null) {
			name = getClass().getSimpleName();
		}
		return name;
	}

	public enum Result {
		DENY,
		DEFAULT,
		ALLOW
	}
}
