package com.zukirou.pomsshortening;

import java.util.List;

import com.zukirou.gameFrameWork.Game;
import com.zukirou.gameFrameWork.Graphics;
import com.zukirou.gameFrameWork.Input.TouchEvent;
import com.zukirou.gameFrameWork.Screen;

import android.graphics.Color;


public class RevisionAnswerScreen extends Screen{
	
	public RevisionAnswerScreen(Game game){
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
					AnswerScreen.answer_id = 0;
					RevisionQuestionAttribute();
					AnswerScreen.answer_of_question[AnswerScreen.question_number] = AnswerScreen.answer_id;
					game.setScreen(new ConfirmAnswerScreen(game));
					return;
				}
				if(event.x > g.getWidth()/2 - 117 && event.x < g.getWidth()/2 - 117 + 235 && event.y < 190 && event.y > 150 ){//select_1
					AnswerScreen.answer_id = 1;
					RevisionQuestionAttribute();
					AnswerScreen.answer_of_question[AnswerScreen.question_number] = AnswerScreen.answer_id;
					game.setScreen(new ConfirmAnswerScreen(game));
					return;
				}
				if(event.x > g.getWidth()/2 - 117 && event.x < g.getWidth()/2 - 117 + 235 && event.y < 235 && event.y > 195 ){//select_2
					AnswerScreen.answer_id = 2;
					RevisionQuestionAttribute();
					AnswerScreen.answer_of_question[AnswerScreen.question_number] = AnswerScreen.answer_id;
					game.setScreen(new ConfirmAnswerScreen(game));
					return;
				}
				if(event.x > g.getWidth()/2 - 117 && event.x < g.getWidth()/2 - 117 + 235 && event.y < 285 && event.y > 240 ){//select_3
					AnswerScreen.answer_id = 3;
					RevisionQuestionAttribute();
					AnswerScreen.answer_of_question[AnswerScreen.question_number] = AnswerScreen.answer_id;
					game.setScreen(new ConfirmAnswerScreen(game));
					return;
				}
				if(event.x > g.getWidth()/2 - 117 && event.x < g.getWidth()/2 - 117 + 235 && event.y < 320 && event.y > 290 ){//select_4
					AnswerScreen.answer_id = 4;
					RevisionQuestionAttribute();
					AnswerScreen.answer_of_question[AnswerScreen.question_number] = AnswerScreen.answer_id;
					game.setScreen(new ConfirmAnswerScreen(game));
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

		g.drawText(Question.DATA[AnswerScreen.question_number][0], question_x, question_y, 20, Color.BLUE);
		
		g.drawTextLeft("âÒìöèCê≥" + (AnswerScreen.question_number + 1) + "/30", 10, 28, 23, Color.DKGRAY);
		
		g.drawText("âﬂãéÇPèTä‘ÇÃÇ†Ç¢ÇæÇÃãCï™ÇÇ†ÇÁÇÌÇ∑ÇÃÇ…", 240, 85, 16, Color.BLACK);
		g.drawText("Ç¢ÇøÇŒÇÒÇ†ÇƒÇÕÇ‹ÇÈÇ‡ÇÃÇÇPÇ¬Ç¶ÇÁÇÒÇ≈Ç≠ÇæÇ≥Ç¢", 240, 100, 16, Color.BLACK);

		g.drawPixmap(Assets.select_0, g.getWidth()/2 - 117, 105);
		g.drawPixmap(Assets.select_1, g.getWidth()/2 - 117, 150);
		g.drawPixmap(Assets.select_2, g.getWidth()/2 - 117, 195);
		g.drawPixmap(Assets.select_3, g.getWidth()/2 - 117, 240);
		g.drawPixmap(Assets.select_4, g.getWidth()/2 - 117, 285);
	}

	public void RevisionQuestionAttribute(){
		String questionAttribute = Question.DATA[AnswerScreen.question_number][1];
				
		if(AnswerScreen.question_number == 25 && AnswerScreen.answer_id == 0){
			GoNextAnswerScreen.C += 4;			
		}else if(AnswerScreen.question_number == 25 && AnswerScreen.answer_id == 1){
			GoNextAnswerScreen.C += 3;			
		}else if(AnswerScreen.question_number == 25 && AnswerScreen.answer_id == 2){
			GoNextAnswerScreen.C += 2;
		}else if(AnswerScreen.question_number == 25 && AnswerScreen.answer_id == 3){
			GoNextAnswerScreen.C += 1;
		}else if(AnswerScreen.question_number == 25 && AnswerScreen.answer_id == 4){
			GoNextAnswerScreen.C += 0;
		}else if(AnswerScreen.question_number != 25 && questionAttribute =="T_A"){
			GoNextAnswerScreen.TA += AnswerScreen.answer_id;
		}else if(AnswerScreen.question_number != 25 && questionAttribute =="D"){
			GoNextAnswerScreen.D += AnswerScreen.answer_id;
		}else if(AnswerScreen.question_number != 25 && questionAttribute =="A_H"){
			GoNextAnswerScreen.AH += AnswerScreen.answer_id;
		}else if(AnswerScreen.question_number != 25 && questionAttribute =="V"){
			GoNextAnswerScreen.V += AnswerScreen.answer_id;
		}else if(AnswerScreen.question_number != 25 && questionAttribute =="F"){
			GoNextAnswerScreen.F += AnswerScreen.answer_id;
		}else if(AnswerScreen.question_number != 25 && questionAttribute =="C"){
			GoNextAnswerScreen.C += AnswerScreen.answer_id;
		}
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