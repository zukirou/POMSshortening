package com.zukirou.pomsshortening;

import java.util.List;

import com.zukirou.gameFrameWork.Game;
import com.zukirou.gameFrameWork.Graphics;
import com.zukirou.gameFrameWork.Input.TouchEvent;
import com.zukirou.gameFrameWork.Screen;

import android.graphics.Color;


public class ResultParameterScreen extends Screen{
	
	public ResultParameterScreen(Game game){
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
				if(event.x > g.getWidth() - 200 && event.x < g.getWidth() && event.y < 40 && event.y > 0 ){//気分プロフィールを見る　ボタン
					game.setScreen(new MoodProfileScreen(game));
					return;
				}
			}		
		}
	}
	
	@Override
	public void present(float deltaTime){
		Graphics g = game.getGraphics();
		int param_x = g.getWidth()/2;//235
		int param_y = 60;

		g.drawPixmap(Assets.POMSshorteningTitle, 0, 0);

		for(int i = 0; i < 7; i++){
			g.drawRect(50, 35 + (i * 40), 380, 35, Color.DKGRAY);
			g.drawRect(55, 40 + (i * 40), 370, 25, Color.WHITE);			
		}

		GoNextAnswerScreen.TMD = GoNextAnswerScreen.TA + GoNextAnswerScreen.D + GoNextAnswerScreen.AH
								+GoNextAnswerScreen.F + GoNextAnswerScreen.C - GoNextAnswerScreen.V;
		
		g.drawText("T-A    " + GoNextAnswerScreen.TA, param_x, param_y     , 20, Color.BLUE);
		g.drawText(" D     " + GoNextAnswerScreen.D , param_x, param_y + 40, 20, Color.BLUE);
		g.drawText("A-H    " + GoNextAnswerScreen.AH, param_x, param_y + 80, 20, Color.BLUE);
		g.drawText(" F     " + GoNextAnswerScreen.F , param_x, param_y + 120, 20, Color.BLUE);
		g.drawText(" C     " + GoNextAnswerScreen.C , param_x, param_y + 160, 20, Color.BLUE);
		g.drawText(" V     " + GoNextAnswerScreen.V , param_x, param_y + 200, 20, Color.BLUE);
		g.drawText("TMD    " + GoNextAnswerScreen.TMD , param_x, param_y + 240, 20, Color.CYAN);
				
		g.drawTextLeft("気分尺度算出", 10, 28, 23, Color.DKGRAY);
		g.drawPixmap(Assets.mood, g.getWidth() - 200, 0);
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