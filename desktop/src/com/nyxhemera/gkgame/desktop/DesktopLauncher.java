package com.nyxhemera.gkgame.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.nyxhemera.gkgame.GKGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "GK-Game";
		config.width = 360;
		config.height = 540;
		//config.backgroundFPS = 0;
		//config.foregroundFPS = 0;
		//config.vSyncEnabled = false;
		new LwjglApplication(new GKGame(), config);
	}
}
