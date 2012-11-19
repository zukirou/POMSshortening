package com.zukirou.pomsshortening;

import java.util.List;

import com.zukirou.gameFrameWork.Game;
import com.zukirou.gameFrameWork.Graphics;
import com.zukirou.gameFrameWork.Input.TouchEvent;
import com.zukirou.gameFrameWork.Screen;

import android.graphics.Color;


public class AnswerScreen extends Screen{
	
	static int question_number = 0;		//åªç›ÇÃéøñ‚î‘çÜ
	static int answer_id;					//ëIëÇµÇΩâÒìöÇÃID
	static int[] answer_of_question = new int[100];	//éøñ‚Ç÷ÇÃâÒìöéÊìæópÇÃîzóÒ
	
	public AnswerScreen(Game game){
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
				if(event.x > g.getWidth()/2 - 117 && event.x < g.getWidth()/2 - 117 + 235 && event.y < 145 && event.y > 105 ){//select_0
					answer_id = 0;
					answer_of_question[question_number] = answer_id;
					game.setScreen(new GoNextAnswerScreen(game));
					return;
				}
				if(event.x > g.getWidth()/2 - 117 && event.x < g.getWidth()/2 - 117 + 235 && event.y < 190 && event.y > 150 ){//select_1
					answer_id = 1;
					answer_of_question[question_number] = answer_id;
					game.setScreen(new GoNextAnswerScreen(game));
					return;
				}
				if(event.x > g.getWidth()/2 - 117 && event.x < g.getWidth()/2 - 117 + 235 && event.y < 235 && event.y > 195 ){//select_2
					answer_id = 2;
					answer_of_question[question_number] = answer_id;
					game.setScreen(new GoNextAnswerScreen(game));
					return;
				}
				if(event.x > g.getWidth()/2 - 117 && event.x < g.getWidth()/2 - 117 + 235 && event.y < 285 && event.y > 240 ){//select_3
					answer_id = 3;
					answer_of_question[question_number] = answer_id;
					game.setScreen(new GoNextAnswerScreen(game));
					return;
				}
				if(event.x > g.getWidth()/2 - 117 && event.x < g.getWidth()/2 - 117 + 235 && event.y < 320 && event.y > 290 ){//select_4
					answer_id = 4;
					answer_of_question[question_number] = answer_id;
					game.setScreen(new GoNextAnswerScreen(game));
					return;
				}
			}		
		}
	}
	
	@Override
	public void present(float deltaTime){
		Graphics g = game.getGraphics();
		int question_x = g.getWidth()/2;//235
		int question_y = 60;

		g.drawPixmap(Assets.POMSshorteningTitle, 0, 0);
		g.drawRect(50, 35, 380, 35, Color.DKGRAY);
		g.drawRect(55, 40, 370, 25, Color.WHITE);
/*
		g.drawText(Question.DATA[question_number][0], question_x - 1, question_y, 21, Color.BLACK);
		g.drawText(Question.DATA[question_number][0], question_x - 1, question_y - 1, 21, Color.BLACK);
		g.drawText(Question.DATA[question_number][0], question_x, question_y - 1, 21, Color.BLACK);
		g.drawText(Question.DATA[question_number][0], question_x + 1, question_y - 1, 21, Color.BLACK);
		g.drawText(Question.DATA[question_number][0], question_x + 1, question_y, 21, Color.BLACK);
		g.drawText(Question.DATA[question_number][0], question_x + 1, question_y + 1, 21, Color.BLACK);
		g.drawText(Question.DATA[question_number][0], question_x , question_y + 1, 21, Color.BLACK);
		g.drawText(Question.DATA[question_number][0], question_x - 1, question_y + 1, 21, Color.BLACK);
*/

		g.drawText(Question.DATA[question_number][0], question_x, question_y, 20, Color.BLUE);
		
		g.drawText("éøñ‚" + (question_number + 1) + "/30", 70, 28, 23, Color.DKGRAY);
		
		g.drawText("âﬂãéÇPèTä‘ÇÃÇ†Ç¢ÇæÇÃãCï™ÇÇ†ÇÁÇÌÇ∑ÇÃÇ…", 240, 85, 16, Color.BLACK);
		g.drawText("Ç¢ÇøÇŒÇÒÇ†ÇƒÇÕÇ‹ÇÈÇ‡ÇÃÇÇPÇ¬Ç¶ÇÁÇÒÇ≈Ç≠ÇæÇ≥Ç¢", 240, 100, 16, Color.BLACK);

		g.drawPixmap(Assets.select_0, g.getWidth()/2 - 117, 105);
		g.drawPixmap(Assets.select_1, g.getWidth()/2 - 117, 150);
		g.drawPixmap(Assets.select_2, g.getWidth()/2 - 117, 195);
		g.drawPixmap(Assets.select_3, g.getWidth()/2 - 117, 240);
		g.drawPixmap(Assets.select_4, g.getWidth()/2 - 117, 285);
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