package com.zukirou.pomsshortening;

import java.util.List;

import com.zukirou.gameFrameWork.Game;
import com.zukirou.gameFrameWork.Graphics;
import com.zukirou.gameFrameWork.Input.TouchEvent;
import com.zukirou.gameFrameWork.Screen;

import android.graphics.Color;

public class GoNextAnswerScreen extends Screen{
	
	static int TA, D, AH, V, F, C, TMD; 	//質問の属性に対応したパラメータ、総計算のパラメータ（TMD）
	static int tempTA, tempD, tempAH, tempV, tempF, tempC, tempTMD; //修正時の属性パラメータ退避用パラメータ
	
	public GoNextAnswerScreen(Game game){
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
				if(event.x > g.getWidth()/2 - 150 && event.x < g.getWidth()/2 - 150 + 300 && event.y < 220 && event.y > 180 ){//次の質問に進む
					
					QuestionAttribute();

					AnswerScreen.question_number += 1;			
					if(AnswerScreen.question_number < 30){
						game.setScreen(new AnswerScreen(game));					
						return;
					}else if(AnswerScreen.question_number > 29){
						game.setScreen(new AllAnswerScreen(game));
					}
				}
				if(event.x > g.getWidth()/2 - 117 && event.x < g.getWidth()/2 - 117 + 300 && event.y < g.getHeight() && event.y > 240 ){//この回答を修正する

					RevisionQuestionAttribute();
					
					game.setScreen(new AnswerScreen(game));					
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
		
		g.drawText("質問" + (AnswerScreen.question_number + 1) + "/30", 70, 28, 23, Color.DKGRAY);
		
		if(AnswerScreen.question_number < 29){
			g.drawPixmap(Assets.nextquestion, g.getWidth()/2 - 150, 180);
			g.drawPixmap(Assets.revisionnow, g.getWidth()/2 - 117, 240);
			
		}else if(AnswerScreen.question_number > 28){
			g.drawPixmap(Assets.endquestion, g.getWidth()/2 - 150, 180);
			g.drawPixmap(Assets.revisionnow, g.getWidth()/2 - 117, 240);
		}
		
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
		tempTA = TA;
		tempD = D;
		tempAH = AH;
		tempV = V;
		tempF = F;
		tempC = C;
		if(AnswerScreen.question_number == 25 && AnswerScreen.answer_id == 0){
			C += 4;			
		}else if(AnswerScreen.question_number == 25 && AnswerScreen.answer_id == 1){
			C += 3;			
		}else if(AnswerScreen.question_number == 25 && AnswerScreen.answer_id == 2){
			C += 2;
		}else if(AnswerScreen.question_number == 25 && AnswerScreen.answer_id == 3){
			C += 1;
		}else if(AnswerScreen.question_number == 25 && AnswerScreen.answer_id == 4){
			C += 0;
		}else if(AnswerScreen.question_number != 25 && questionAttribute =="T_A"){
			TA += AnswerScreen.answer_id;
		}else if(AnswerScreen.question_number != 25 && questionAttribute =="D"){
			D += AnswerScreen.answer_id;
		}else if(AnswerScreen.question_number != 25 && questionAttribute =="A_H"){
			AH += AnswerScreen.answer_id;
		}else if(AnswerScreen.question_number != 25 && questionAttribute =="V"){
			V += AnswerScreen.answer_id;
		}else if(AnswerScreen.question_number != 25 && questionAttribute =="F"){
			F += AnswerScreen.answer_id;
		}else if(AnswerScreen.question_number != 25 && questionAttribute =="C"){
			C += AnswerScreen.answer_id;
		}
	}
	
	public void RevisionQuestionAttribute(){
		String questionAttribute = Question.DATA[AnswerScreen.question_number][1];
		if(AnswerScreen.question_number == 25 && AnswerScreen.answer_id == 0){
			C = tempC;
//			C += 4;			
		}else if(AnswerScreen.question_number == 25 && AnswerScreen.answer_id == 1){
			C = tempC;
//			C += 3;			
		}else if(AnswerScreen.question_number == 25 && AnswerScreen.answer_id == 2){
			C = tempC;
//			C += 2;
		}else if(AnswerScreen.question_number == 25 && AnswerScreen.answer_id == 3){
			C = tempC;
//			C += 1;
		}else if(AnswerScreen.question_number == 25 && AnswerScreen.answer_id == 4){
			C = tempC;
//			C += 0;
		}else if(AnswerScreen.question_number != 25 && questionAttribute =="T_A"){
			TA = tempTA;
//			TA += AnswerScreen.answer_id;
		}else if(AnswerScreen.question_number != 25 && questionAttribute =="D"){
			D = tempD;
//			D += AnswerScreen.answer_id;
		}else if(AnswerScreen.question_number != 25 && questionAttribute =="A_H"){
			AH = tempAH;
//			AH += AnswerScreen.answer_id;
		}else if(AnswerScreen.question_number != 25 && questionAttribute =="V"){
			V = tempV;
//			V += AnswerScreen.answer_id;
		}else if(AnswerScreen.question_number != 25 && questionAttribute =="F"){
			F = tempF;
//			F += AnswerScreen.answer_id;
		}else if(AnswerScreen.question_number != 25 && questionAttribute =="C"){
//			C += AnswerScreen.answer_id;
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