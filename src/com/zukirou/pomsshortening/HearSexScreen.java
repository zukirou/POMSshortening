package com.zukirou.pomsshortening;

import java.util.List;

import com.zukirou.gameFrameWork.Game;
import com.zukirou.gameFrameWork.Graphics;
import com.zukirou.gameFrameWork.Input.TouchEvent;
import com.zukirou.gameFrameWork.Screen;

import android.graphics.Color;


public class HearSexScreen extends Screen{
	
	static int sex;
	
	public HearSexScreen(Game game){
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
				if(event.x > 0 && event.x < 240 && event.y < 220 && event.y > 160 ){//男性ボタン
					sex = 1;
					game.setScreen(new ConfirmSexScreen(game));
					return;
				}
				if(event.x > g.getWidth()/2  && event.x < g.getWidth() && event.y < 220 && event.y > 160 ){//女性ボタン
					sex = 2;
					game.setScreen(new ConfirmSexScreen(game));
					return;
				}
			}		
		}
	}
	
	@Override
	public void present(float deltaTime){
		Graphics g = game.getGraphics();
	
		g.drawPixmap(Assets.POMSshorteningTitle, 0, 0);

		g.drawText("あなたの性別を", 240, 85, 40, Color.BLACK);
		g.drawText("おしえてください", 240, 140, 40, Color.BLACK);

		g.drawPixmap(Assets.dansei, g.getWidth()/2 - 240, 160);
		g.drawPixmap(Assets.jyosei, g.getWidth()/2, 160);

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