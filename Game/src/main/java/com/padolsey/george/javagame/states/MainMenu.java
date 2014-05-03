package com.padolsey.george.javagame.states;

import com.padolsey.george.javagame.PButton;
import com.padolsey.george.javagame.*;
import com.padolsey.george.javagame.annotations.PGameStateMeta;
import org.newdawn.slick.Color;
import org.newdawn.slick.*;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.state.StateBasedGame;

import java.awt.*;
import java.awt.Font;

import static com.padolsey.george.javagame.Messages._;
import static com.padolsey.george.javagame.utils.Utils.getTrueTypeFont;

/**
 * <p/>
 * Latest Change:
 * <p/>
 *
 * @author George
 * @since 01/05/2014
 */
@PGameStateMeta(
	state = States.MAIN_MENU
)
public class MainMenu extends PGameState {

	private final PButton playButton;
	private final TrueTypeFont font;


	public MainMenu() {
		font = getTrueTypeFont(new Font("Verdana", Font.BOLD, 24), true);
		playButton = new PButton(new Dimension(400, 100), new Coordinates((float)200, (float)200), _("play"), font);
	}

	@Override
	public void init(GameContainer gameContainer, StateBasedGame stateBasedGame) throws SlickException {
		playButton.init();
	}

	@Override
	public void render(GameContainer gameContainer, StateBasedGame stateBasedGame, Graphics graphics) throws SlickException {
		graphics.setColor(Color.white);
		graphics.drawLine(0, 0, 500, 500);
		String gameTitle = _("game-title");
		Integer textWidth = graphics.getFont().getWidth(gameTitle);
		graphics.drawString(gameTitle, (gameContainer.getWidth()-textWidth)/2, 1000);
		playButton.render(gameContainer, stateBasedGame, graphics);
	}

	@Override
	public void update(GameContainer gameContainer, StateBasedGame stateBasedGame, int i) throws SlickException {
		playButton.update(gameContainer, stateBasedGame, i);
	}

	@Override
	public void enter(GameContainer gameContainer, StateBasedGame stateBasedGame) throws SlickException {

	}

	@Override
	public void leave(GameContainer gameContainer, StateBasedGame stateBasedGame) throws SlickException {

	}

	@Override
	public void controllerLeftPressed(int i) {

	}

	@Override
	public void controllerLeftReleased(int i) {

	}

	@Override
	public void controllerRightPressed(int i) {
	}

	@Override
	public void controllerRightReleased(int i) {
	}

	@Override
	public void controllerUpPressed(int i) {

	}

	@Override
	public void controllerUpReleased(int i) {

	}

	@Override
	public void controllerDownPressed(int i) {

	}

	@Override
	public void controllerDownReleased(int i) {

	}

	@Override
	public void controllerButtonPressed(int i, int i2) {

	}

	@Override
	public void controllerButtonReleased(int i, int i2) {

	}

	@Override
	public void keyPressed(int i, char c) {

	}

	@Override
	public void keyReleased(int i, char c) {

	}

	@Override
	public void mouseWheelMoved(int i) {

	}

	@Override
	public void mouseClicked(int i, int i2, int i3, int i4) {

	}

	@Override
	public void mousePressed(int i, int i2, int i3) {

	}

	@Override
	public void mouseReleased(int i, int i2, int i3) {

	}

	@Override
	public void mouseMoved(int i, int i2, int i3, int i4) {

	}

	@Override
	public void mouseDragged(int i, int i2, int i3, int i4) {
	}

	@Override
	public void setInput(Input input) {
	}

	@Override
	public boolean isAcceptingInput() {
		return false;
	}

	@Override
	public void inputEnded() {
	}

	@Override
	public void inputStarted() {

	}
}
