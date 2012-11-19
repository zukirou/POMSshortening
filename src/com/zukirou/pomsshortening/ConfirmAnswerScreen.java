package com.zukirou.pomsshortening;

import java.util.List;

import com.zukirou.gameFrameWork.Game;
import com.zukirou.gameFrameWork.Graphics;
import com.zukirou.gameFrameWork.Input.TouchEvent;
import com.zukirou.gameFrameWork.Screen;

import android.graphics.Color;

public class ConfirmAnswerScreen extends Screen{
		
	public ConfirmAnswerScreen(Game game){
		super(game);
/*		
		GoNextAnswerScreen.tempTA = GoNextAnswerScreen.TA;
		GoNextAnswerScreen.tempD = GoNextAnswerScreen.D;
		GoNextAnswerScreen.tempAH = GoNextAnswerScreen.AH;
		GoNextAnswerScreen.tempV = GoNextAnswerScreen.V;
		GoNextAnswerScreen.tempF = GoNextAnswerScreen.F;
		GoNextAnswerScreen.tempC = GoNextAnswerScreen.C;
*/
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
				if(event.x > g.getWidth()/2 - 150 && event.x < g.getWidth()/2 - 150 + 300 && event.y < 220 && event.y > 180 ){
//					QuestionAttribute();
					game.setScreen(new AllAnswerScreen(game));
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
		
		g.drawTextLeft("質問" + (AnswerScreen.question_number + 1) + "の修正確認", 10, 28, 23, Color.DKGRAY);

		g.drawPixmap(Assets.revisionend, g.getWidth()/2 - 150, 180);

		switch(AnswerScreen.answer_id){//選択された回答を表示
		case 0:
			g.drawPixmap(Assets.select_0push, g.getWidth()/2 - 117, 105);
			break;
			
		case 1:
			g.drawPixmap(Assets.select_1push, g.getWidth()/2 - 117, 105);
			break;
			
		case 2:
			g.drawPixmap(Assets.select_2push, g.getWidth()/2 - 117, 105);
			break;
		
		case 3:
			g.drawPixmap(Assets.select_3push, g.getWidth()/2 - 117, 105);
			break;
			
		case 4:
			g.drawPixmap(Assets.select_4push, g.getWidth()/2 - 117, 105);
			break;
			
		default:
			break;
		}
	}
	
	public void QuestionAttribute(){
		String questionAttribute = Question.DATA[AnswerScreen.question_number][1];
		if(AnswerScreen.question_number == 25 && AnswerScreen.answer_id == 0){
			GoNextAnswerScreen.C = GoNextAnswerScreen.tempC;
			GoNextAnswerScreen.C -= 4;			
		}else if(AnswerScreen.question_number == 25 && AnswerScreen.answer_id == 1){
			GoNextAnswerScreen.C = GoNextAnswerScreen.tempC;
			GoNextAnswerScreen.C -= 3;			
		}else if(AnswerScreen.question_number == 25 && AnswerScreen.answer_id == 2){
			GoNextAnswerScreen.C = GoNextAnswerScreen.tempC;
			GoNextAnswerScreen.C -= 2;
		}else if(AnswerScreen.question_number == 25 && AnswerScreen.answer_id == 3){
			GoNextAnswerScreen.C = GoNextAnswerScreen.tempC;
			GoNextAnswerScreen.C -= 1;
		}else if(AnswerScreen.question_number == 25 && AnswerScreen.answer_id == 4){
			GoNextAnswerScreen.C = GoNextAnswerScreen.tempC;
			GoNextAnswerScreen.C -= 0;
		}else if(AnswerScreen.question_number != 25 && questionAttribute =="T_A"){
			GoNextAnswerScreen.TA = GoNextAnswerScreen.tempTA;
			GoNextAnswerScreen.TA -= AnswerScreen.answer_id;
		}else if(AnswerScreen.question_number != 25 && questionAttribute =="D"){
			GoNextAnswerScreen.D = GoNextAnswerScreen.tempD;
			GoNextAnswerScreen.D -= AnswerScreen.answer_id;
		}else if(AnswerScreen.question_number != 25 && questionAttribute =="A_H"){
			GoNextAnswerScreen.AH = GoNextAnswerScreen.tempAH;
			GoNextAnswerScreen.AH -= AnswerScreen.answer_id;
		}else if(AnswerScreen.question_number != 25 && questionAttribute =="V"){
			GoNextAnswerScreen.V = GoNextAnswerScreen.tempV;
			GoNextAnswerScreen.V -= AnswerScreen.answer_id;
		}else if(AnswerScreen.question_number != 25 && questionAttribute =="F"){
			GoNextAnswerScreen.F = GoNextAnswerScreen.tempF;
			GoNextAnswerScreen.F -= AnswerScreen.answer_id;
		}else if(AnswerScreen.question_number != 25 && questionAttribute =="C"){
			GoNextAnswerScreen.C = GoNextAnswerScreen.tempC;
			GoNextAnswerScreen.C -= AnswerScreen.answer_id;
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