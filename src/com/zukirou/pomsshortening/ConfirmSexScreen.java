package com.zukirou.pomsshortening;

import java.util.List;

import com.zukirou.gameFrameWork.Game;
import com.zukirou.gameFrameWork.Graphics;
import com.zukirou.gameFrameWork.Input.TouchEvent;
import com.zukirou.gameFrameWork.Screen;

import android.graphics.Color;

public class ConfirmSexScreen extends Screen{
	
	public ConfirmSexScreen(Game game){
		super(game);
	}
		
	@Override
	public void update(float deltaTime){
		Graphics g = game.getGraphics();
		List<TouchEvent> touchEvents = game.getInput().getTouchEvents();
		game.getInput().getKeyEvents();
		
		int len = touchEvents.size();
		for(int i = 0; i < len ; i++){
			TouchEvent event = touchEvents.get(i);
			if(event.type == TouchEvent.TOUCH_UP){
				if(event.x > 0 && event.x < g.getWidth()/2 && event.y < g.getHeight() && event.y > 240 ){//「はい」ボタン
					game.setScreen(new AnswerScreen(game));					
					return;
				}
				if(event.x > g.getWidth()/2 && event.x < g.getWidth() && event.y < g.getHeight() && event.y > 240 ){//「はい」ボタン
					game.setScreen(new MainMenuScreen(game));
					return;
				}
			}		
		}
	}
	
	@Override
	public void present(float deltaTime){
		Graphics g = game.getGraphics();
		
		g.drawPixmap(Assets.POMSshorteningTitle, 0, 0);

		g.drawText("あなたは", g.getWidth() / 2, 60, 40, Color.BLUE);
		switch(HearSexScreen.sex){
		case 0:
			break;
		case 1:
			g.drawPixmap(Assets.dansei, g.getWidth()/2 - 117, 75);
			break;
		case 2:
			g.drawPixmap(Assets.jyosei, g.getWidth()/2 - 117, 75);
			break;
		default:
			break;
		}
		g.drawText("ですね。", g.getWidth() / 2, 175, 40, Color.BLUE);
		g.drawPixmap(Assets.yes, g.getWidth()/2 - 235, 230);
		g.drawPixmap(Assets.no, g.getWidth()/2 , 230);
		
		

	}
	
	@Override
	public void pause(){
		
	}
	
	@Override
	public void resume(){
		
	}
	
	@Override
	public void dispose(){
		
	}


}