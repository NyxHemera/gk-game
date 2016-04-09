package com.nyxhemera.screens;

import com.badlogic.gdx.Screen;
import com.nyxhemera.gameworld.GameWorld;
import com.nyxhemera.gkgame.GKGame;

public class GameScreen implements Screen{
	
	GKGame GKG;
	GameWorld world;
	
	
	public GameScreen(GKGame GKG) {
		this.GKG = GKG;
		this.world = new GameWorld(this);
	}
	
	public void update(float delta) {
		world.update(delta);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(float delta) {
		world.render(delta);
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
