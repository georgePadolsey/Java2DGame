package com.padolsey.george.javagame.utils;

import com.padolsey.george.javagame.Coordinates;
import org.newdawn.slick.TrueTypeFont;

import java.awt.*;

/**
 * <p/>
 * Latest Change:
 * <p/>
 *
 * @author George
 * @since 03/05/2014
 */
public class Utils {
	public static Coordinates centerText(Dimension dimension, TrueTypeFont font, String text) {
		return new Coordinates((float) (dimension.getWidth() - font.getWidth(text))/2,
				(float) (dimension.getHeight() - font.getHeight(text))/2);
	}

	public static TrueTypeFont getTrueTypeFont(Font font) {
		return getTrueTypeFont(font, false);
	}

	public static TrueTypeFont getTrueTypeFont(Font font, Boolean antiAlias) {
		return new TrueTypeFont(font, antiAlias);
	}
}
