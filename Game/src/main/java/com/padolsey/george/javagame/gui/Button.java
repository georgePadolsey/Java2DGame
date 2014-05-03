package com.padolsey.george.javagame.gui;

import com.padolsey.george.javagame.events.ButtonClickEvent;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.state.StateBasedGame;

/**
 * <p/>
 * Latest Change:
 * <p/>
 *
 * @author George
 * @since 03/05/2014
 */
public interface Button {

	public void init();

	public void render(GameContainer gameContainer, StateBasedGame stateBasedGame, Graphics graphics);

	public void update(GameContainer gameContainer, StateBasedGame stateBasedGame, int i);

	public void onClick(ButtonClickEvent event);
}
