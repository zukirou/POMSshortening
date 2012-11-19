package com.zukirou.pomsshortening;

import java.util.List;

import com.zukirou.gameFrameWork.Game;
import com.zukirou.gameFrameWork.Graphics;
import com.zukirou.gameFrameWork.Input.TouchEvent;
import com.zukirou.gameFrameWork.Screen;

import android.graphics.Color;

//import android.app.ListActivity;
//import android.content.Intent;

import java.util.ArrayList;


public class AllAnswerScreen extends Screen {
	
	GoNextAnswerScreen gonextanswerScreen = new GoNextAnswerScreen(game);
	String[] question;
	String[] answer;
	int[] questionlist_y = new int[30];
	int[] answerlist_y = new int[30];
	
	public AllAnswerScreen(Game game){
		super(game);

		for(int i = 0; i < Question.DATA.length; i++){
			questionlist_y[i] = 140 + (i * 40);//�e���╶�̕\�������W��ݒ�
			answerlist_y[i] = 160 + (i * 40);//�e�񓚂ɕ\�������W��ݒ�
		}
		
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
				if(event.x > g.getWidth() - 255 && event.x < g.getWidth() && event.y < 80 && event.y > 5 ){
					game.setScreen(new ResultParameterScreen(game));
				}
				if(event.x > g.getWidth() - 75 && event.x < g.getWidth() && event.y < 200 && event.y > 140 ){//������{�^�����^�b�`
					for(int j = 0; j < Question.DATA.length; j++){
						questionlist_y[j] -= 40;
						answerlist_y[j] -= 40;
						if(questionlist_y[j] < 140)
							questionlist_y[j] = 1300;
						if(answerlist_y[j] < 160)
							answerlist_y[j] = 1320;
					}
				}
				if(event.x > g.getWidth() - 75 && event.x < g.getWidth() && event.y < 310 && event.y > 240 ){//�������{�^�����^�b�`
					for(int k = 0; k < Question.DATA.length; k++){
						questionlist_y[k] += 40;
						answerlist_y[k] += 40;
						if(questionlist_y[k] > 1300)
							questionlist_y[k] = 140;
						if(answerlist_y[k] > 1320)
							answerlist_y[k] = 160;
					}
				}
				for (int l = 0; l < Question.DATA.length; l++){
					if(event.x > 0 && event.x < 50 && event.y < questionlist_y[l] - 18 + 40 && event.y > questionlist_y[l] - 18 ){//�ԍ��{�^�����^�b�`
						AnswerScreen.question_number = l;
						
						String questionAttribute = Question.DATA[AnswerScreen.question_number][1];
						
						if(AnswerScreen.question_number == 25){
							switch(AnswerScreen.answer_of_question[25]){
							case 0:
								GoNextAnswerScreen.C -= 4;
								break;
							case 1:
								GoNextAnswerScreen.C -= 3;
								break;
							case 2:
								GoNextAnswerScreen.C -= 2;
								break;
							case 3:
								GoNextAnswerScreen.C -= 1;
								break;
							case 4:
								GoNextAnswerScreen.C -= 0;
								break;
							default :
								break;
							}
						}else{
							switch(AnswerScreen.answer_of_question[l]){
							case 0:
								DecScore(questionAttribute , l);
								break;
							case 1:
								DecScore(questionAttribute , l);
								break;
							case 2:
								DecScore(questionAttribute , l);
								break;
							case 3:
								DecScore(questionAttribute , l);
								break;
							case 4:
								DecScore(questionAttribute , l);
								break;
							default:
								break;
							}
						}						
						game.setScreen(new RevisionAnswerScreen(game));
					}
				}
			}		
		}
	}
	
	@Override
	public void present(float deltaTime){
		Graphics g = game.getGraphics();
		ArrayList<String>question_list = new ArrayList<String>();
		ArrayList<String>answer_list = new ArrayList<String>();		

		g.drawPixmap(Assets.POMSshorteningTitle, 0, 0);
		g.drawPixmap(Assets.allanswerend, g.getWidth() - 255, 8);
		g.drawPixmap(Assets.buttonup, g.getWidth() - 75, 150);
		g.drawPixmap(Assets.buttondown, g.getWidth() - 75, 250);
		
		g.drawText("�S�񓚊m�F", 70, 28, 23, Color.DKGRAY);
		g.drawTextLeft("�����ꂳ�܂ł����B����͂��ׂďI���ł��B", 10, 65, 16, Color.BLACK);
		g.drawTextLeft("�C���������ԍ����^�b�`���Ă��������B", 10, 85, 16, Color.BLACK);
		g.drawTextLeft("�C���̕K�v���Ȃ���΁u�I���ɂ���v���^�b�`���Ă��������B", 10, 105, 16, Color.BLACK);

		for(int i = 0; i < Question.DATA.length; i++){
			question_list.add(Question.DATA[i][0]);//���╶�����X�g��
		}

		for(int i = 0; i < question_list.size() ; i++){//���╶��\��
			g.drawTextLeft(question_list.get(i), 40, questionlist_y[i], 18, Color.BLACK);					
		}
		
		for(int i = 0; i < Question.DATA.length; i++){
			int answer_number = AnswerScreen.answer_of_question[i];
			switch(answer_number){//�񓚂����X�g��
			case 0:
				answer_list.add("�܂������Ȃ�����");
				break;
			case 1:
				answer_list.add("����������");
				break;
			case 2:
				answer_list.add("�܂��܂�������");
				break;
			case 3:
				answer_list.add("���Ȃ肠����");
				break;
			case 4:
				answer_list.add("���ɑ���������");
				break;
			default:
				break;
			}
		}		

		for(int i = 0; i < answer_list.size() ; i++){//�񓚂�\��
			g.drawTextLeft(">>> " + answer_list.get(i), 150, answerlist_y[i], 20, Color.BLUE);
		}
		
		//�ԍ��{�^���̕\��
		g.drawPixmap(Assets.button01, 10, questionlist_y[0] - 18);
		g.drawPixmap(Assets.button02, 10, questionlist_y[1] - 18);
		g.drawPixmap(Assets.button03, 10, questionlist_y[2] - 18);
		g.drawPixmap(Assets.button04, 10, questionlist_y[3] - 18);
		g.drawPixmap(Assets.button05, 10, questionlist_y[4] - 18);
		g.drawPixmap(Assets.button06, 10, questionlist_y[5] - 18);
		g.drawPixmap(Assets.button07, 10, questionlist_y[6] - 18);
		g.drawPixmap(Assets.button08, 10, questionlist_y[7] - 18);
		g.drawPixmap(Assets.button09, 10, questionlist_y[8] - 18);
		g.drawPixmap(Assets.button10, 10, questionlist_y[9] - 18);
		g.drawPixmap(Assets.button11, 10, questionlist_y[10] - 18);
		g.drawPixmap(Assets.button12, 10, questionlist_y[11] - 18);
		g.drawPixmap(Assets.button13, 10, questionlist_y[12] - 18);
		g.drawPixmap(Assets.button14, 10, questionlist_y[13] - 18);
		g.drawPixmap(Assets.button15, 10, questionlist_y[14] - 18);
		g.drawPixmap(Assets.button16, 10, questionlist_y[15] - 18);
		g.drawPixmap(Assets.button17, 10, questionlist_y[16] - 18);
		g.drawPixmap(Assets.button18, 10, questionlist_y[17] - 18);
		g.drawPixmap(Assets.button19, 10, questionlist_y[18] - 18);
		g.drawPixmap(Assets.button20, 10, questionlist_y[19] - 18);
		g.drawPixmap(Assets.button21, 10, questionlist_y[20] - 18);
		g.drawPixmap(Assets.button22, 10, questionlist_y[21] - 18);
		g.drawPixmap(Assets.button23, 10, questionlist_y[22] - 18);
		g.drawPixmap(Assets.button24, 10, questionlist_y[23] - 18);
		g.drawPixmap(Assets.button25, 10, questionlist_y[24] - 18);
		g.drawPixmap(Assets.button26, 10, questionlist_y[25] - 18);
		g.drawPixmap(Assets.button27, 10, questionlist_y[26] - 18);
		g.drawPixmap(Assets.button28, 10, questionlist_y[27] - 18);
		g.drawPixmap(Assets.button29, 10, questionlist_y[28] - 18);
		g.drawPixmap(Assets.button30, 10, questionlist_y[29] - 18);	
	}
	
	public void DecScore(String questionattribute, int questionnum){
		if( questionattribute == "T_A"){
			GoNextAnswerScreen.TA -= AnswerScreen.answer_of_question[questionnum];
		}else if( questionattribute == "D"){
			GoNextAnswerScreen.D -= AnswerScreen.answer_of_question[questionnum];
		}else if( questionattribute == "A_H"){
			GoNextAnswerScreen.AH -= AnswerScreen.answer_of_question[questionnum];
		}else if( questionattribute == "V"){
			GoNextAnswerScreen.V -= AnswerScreen.answer_of_question[questionnum];
		}else if( questionattribute == "F"){
			GoNextAnswerScreen.F -= AnswerScreen.answer_of_question[questionnum];
		}else if( questionattribute == "C"){
			GoNextAnswerScreen.C -= AnswerScreen.answer_of_question[questionnum];
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