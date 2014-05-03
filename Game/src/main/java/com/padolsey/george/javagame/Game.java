package com.padolsey.george.javagame;

import lombok.Getter;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.command.InputProvider;
import org.newdawn.slick.command.InputProviderListener;
import org.newdawn.slick.state.StateBasedGame;
import org.reflections.Reflections;

import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

import static com.padolsey.george.javagame.Messages._;

public class Game extends StateBasedGame {

    /** Screen width */
    private static final double WIDTH = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
    /** Screen height */
    private static final double HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().getHeight();
    
    /** A counter... */
    private int counter;

	@Getter
	private static Properties properties;

	@Getter
	private static InputProvider inputProvider;

	public Game() {
        super(_("game-title"));
		init();
    }

	private void init() {
		inputProvider = new InputProvider(getContainer().getInput());

		registerInputProviderListeners(new PInputManager());
	}

	@Override
	public void initStatesList(GameContainer gameContainer) throws SlickException {
		Reflections reflections = new Reflections("com.padolsey.george.javagame.states");

		Set<Class<? extends PGameState>> allClasses = reflections.getSubTypesOf(PGameState.class);

		for (Class<? extends PGameState> allClass : allClasses) {
			try {
				addState(allClass.newInstance());
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
	}

	private void registerInputProviderListeners(InputProviderListener... inputProviderListeners) {
		for(InputProviderListener inputProviderListener: inputProviderListeners) {
			if(inputProviderListener == null) continue;
			inputProvider.addListener(inputProviderListener);
		}
	}

	public static void main(String[] args) throws SlickException {
	    loadProperties();
        AppGameContainer app = new AppGameContainer(new Game());
        app.setDisplayMode((int)WIDTH, (int)HEIGHT, false);
        app.setForceExit(false);
	    app.setShowFPS(false);
        app.start();
    }

	private static void loadProperties() {
		properties = new Properties();
		InputStream input = null;

		try {

			String filename = "en.properties";
			input = Game.class.getClassLoader().getResourceAsStream(filename);
			if (input == null) {
				System.out.println("Sorry, unable to find " + filename);
				return;
			}

			properties.load(input);

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}



}
