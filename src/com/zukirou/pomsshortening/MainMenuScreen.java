package com.zukirou.pomsshortening;

import java.util.List;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;

import com.zukirou.gameFrameWork.Game;
import com.zukirou.gameFrameWork.Graphics;
import com.zukirou.gameFrameWork.Input.TouchEvent;
import com.zukirou.gameFrameWork.Screen;

public class MainMenuScreen extends Screen{
	
	public MainMenuScreen(Game game){
		super(game);
	}
	@Override
	public void update(float deltaTime){
		
		Graphics g = game.getGraphics();
		List<TouchEvent> touchEvents = game.getInput().getTouchEvents();
		game.getInput().getKeyEvents();
		
		int len = touchEvents.size();
		
		for(int i = 0; i < len; i++){
			TouchEvent event = touchEvents.get(i);
			if(event.type == TouchEvent.TOUCH_UP){
				if(inBounds(event, g.getWidth()/2 - 117, 220, 235, 55)){
					game.setScreen(new HearSexScreen(game));
				return;
				}
			}
		}

	}
	
	private boolean inBounds(TouchEvent event, int x, int y, int width, int height){
		if(event.x > x && event.x < x + width - 1 && event.y > y && event.y < y + height - 1)
			return true;
		else
			return false;
	}
	
	@Override
	public void present(float deltaTime){
		Graphics g = game.getGraphics();
		
		g.drawPixmap(Assets.POMSshorteningTitle, 0, 0);
		g.drawPixmap(Assets.hajimeru, g.getWidth()/2 - 117, 220);
				
	}
	
	
	@Override
	public void pause(){
		Settings.save(game.getFileIO());
	}
	
	@Override
	public void resume(){
		
	}
	
	@Override
	public void dispose(){
		
	}
}