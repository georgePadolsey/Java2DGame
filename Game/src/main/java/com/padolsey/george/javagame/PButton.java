package com.padolsey.george.javagame;

import com.padolsey.george.javagame.events.ButtonClickEvent;
import lombok.RequiredArgsConstructor;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.TrueTypeFont;
import org.newdawn.slick.state.StateBasedGame;

import java.awt.*;

import static com.padolsey.george.javagame.utils.Utils.centerText;


/**
 * <p/>
 * Latest Change:
 * <p/>
 *
 * @author George
 * @since 02/05/2014
 */
@RequiredArgsConstructor
public class PButton implements com.padolsey.george.javagame.gui.Button {

	private final Dimension dimension;
	private final Coordinates coordinates;
	private final String name;
	private final TrueTypeFont font;

	@Override
	public void init() {
	}

	@Override
	public void render(GameContainer gameContainer, StateBasedGame stateBasedGame, Graphics graphics) {
		graphics.setColor(Color.white);
		graphics.fillRect(coordinates.getX(), coordinates.getY(), (float) dimension.getWidth(), (float) dimension.getHeight());
		Coordinates coord = centerText(
				dimension,
				font,
				name
		);
		font.drawString(
				(coord.getX() + coordinates.getX()),
				(coord.getY() + coordinates.getY()),
				name,
				Color.black
		);
	}

	@Override
	public void update(GameContainer gameContainer, StateBasedGame stateBasedGame, int i) {
	}

	@Override
	public void onClick(ButtonClickEvent event) {
	}
}
