package com.padolsey.george.javagame.events;

/**
 * <p/>
 * Latest Change:
 * <p/>
 *
 * @author George
 * @since 03/05/2014
 */
public interface Cancellable {

	public boolean isCancelled();

	public void setCancelled(boolean cancel);
}
