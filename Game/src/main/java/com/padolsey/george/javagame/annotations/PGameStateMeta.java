package com.padolsey.george.javagame.annotations;

import com.padolsey.george.javagame.States;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p/>
 * Latest Change:
 * <p/>
 *
 * @author George
 * @since 01/05/2014
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface PGameStateMeta {

	public String key() default "null";

	public String longName() default "Not Implemented";

	public States state() default States.NULL;
}
