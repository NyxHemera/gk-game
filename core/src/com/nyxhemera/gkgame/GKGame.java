package com.nyxhemera.gkgame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.nyxhemera.handlers.AssetLoader;
import com.nyxhemera.handlers.Content;
import com.nyxhemera.handlers.GameStateManager;

public class GKGame implements ApplicationListener {
	
	public static final String TITLE = "GK Game";
	public static final int V_WIDTH = 360;
	public static final int V_HEIGHT = 540;
	//public static final int SCALE = 2;
	public static final float STEP = 1 / 60f;
	
	private SpriteBatch sb;
	private OrthographicCamera cam;
	
	private GameStateManager gsm;
	
	public static Content cont;

	public void create() {
		
		cam = new OrthographicCamera();
		cam.setToOrtho(false, V_WIDTH, V_HEIGHT);
		
		sb = new SpriteBatch();
		gsm = new GameStateManager(this);
		
	}

	public void resize(int width, int height) {
		
	}

	public void render() {
		Gdx.graphics.setTitle(TITLE + " -- FPS: " + Gdx.graphics.getFramesPerSecond());
		
		// Begin update/render split
		gsm.update(Gdx.graphics.getDeltaTime());
		gsm.render();
	}

	public void dispose() {
		cont.dispose();
	}

	public void pause() {}
	public void resume() {}
	
	// Getters and Setters
	public OrthographicCamera getCam() { return cam; }
	public SpriteBatch getSpriteBatch() { return sb; }
	
}
