package com.padolsey.george.javagame;

import com.padolsey.george.javagame.annotations.PGameStateMeta;
import com.padolsey.george.javagame.exceptions.NotImplementedException;
import org.newdawn.slick.state.GameState;

/**
 * <p/>
 * Latest Change:
 * <p/>
 *
 * @author George
 * @since 01/05/2014
 */
public abstract class PGameState implements GameState {

	public PGameState() {

	}

	@Override
	public final int getID() {
		return getMeta().state().getId();
	}

	public PGameStateMeta getMeta() {
		try {
			if(!getClass().isAnnotationPresent(PGameStateMeta.class)) {
				throw new NotImplementedException("PGameStateMeta has not been implemented in the class: "+getClass().getName());
			}
		} catch (NotImplementedException e) {
			e.printStackTrace();
		}

		return getClass().getAnnotation(PGameStateMeta.class);
	}
}
