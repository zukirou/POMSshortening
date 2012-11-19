package com.zukirou.pomsshortening;

import java.util.List;

import com.zukirou.gameFrameWork.Game;
import com.zukirou.gameFrameWork.Graphics;
import com.zukirou.gameFrameWork.Input.TouchEvent;
import com.zukirou.gameFrameWork.Screen;

import android.graphics.Color;


public class MoodProfileScreen extends Screen{

	int t_of_TA, t_of_D, t_of_AH, t_of_V, t_of_F, t_of_C;//気分プロフィール用の値
	
	public MoodProfileScreen(Game game){
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
					game.setScreen(new ResultParameterScreen(game));
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
		g.drawTextLeft("気分プロフィール", 10, 28, 23, Color.DKGRAY);
		g.drawPixmap(Assets.moodparam, g.getWidth() - 200, 0);

	
		g.drawRectLine(20, 40, 450, 250, Color.DKGRAY);
		for(int i = 0; i < 210; i += 42){
			g.drawLine(20, 82 + i, 470, 82 + i, Color.DKGRAY);
		}
		for(int i = 80; i < 470; i += 6){
			g.drawLine(i, 40, i, 290, Color.DKGRAY);
		}
		for(int i = 80; i < 470; i += 60){
			g.drawLine(i, 40, i, 290, Color.RED);
		}
		
		g.drawText("20", 80, 310, 20, Color.BLUE);			
		g.drawText("30", 140, 310, 20, Color.BLUE);
		g.drawText("40", 200, 310, 20, Color.BLUE);
		g.drawText("50", 260, 310, 20, Color.BLUE);
		g.drawText("60", 320, 310, 20, Color.BLUE);
		g.drawText("70", 380, 310, 20, Color.BLUE);
		g.drawText("80", 440, 310, 20, Color.BLUE);
		
		g.drawTextLeft("T-A", 35, 70, 20, Color.BLUE);
		g.drawTextLeft("D", 35, 112, 20, Color.BLUE);
		g.drawTextLeft("A-H", 35, 154, 20, Color.BLUE);
		g.drawTextLeft("F", 35, 196, 20, Color.BLUE);
		g.drawTextLeft("C", 35, 238, 20, Color.BLUE);
		g.drawTextLeft("V", 35, 280, 20, Color.BLUE);
		
		//気分尺度の数値をT得点に変換
		if(HearSexScreen.sex == 1){//男
			switch(GoNextAnswerScreen.TA){
			case 0:
				t_of_TA = 33;
				break;
			case 1:
				t_of_TA = 35;
				break;
			case 2:
				t_of_TA = 38;
				break;
			case 3:
				t_of_TA = 40;
				break;
			case 4:
				t_of_TA = 43;
				break;
			case 5:
				t_of_TA = 45;
				break;
			case 6:
				t_of_TA = 48;
				break;
			case 7:
				t_of_TA = 50;
				break;
			case 8:
				t_of_TA = 53;
				break;
			case 9:
				t_of_TA = 55;
				break;
			case 10:
				t_of_TA = 58;
				break;
			case 11:
				t_of_TA = 60;
				break;
			case 12:
				t_of_TA = 63;
				break;
			case 13:
				t_of_TA = 65;
				break;
			case 14:
				t_of_TA = 68;
				break;
			case 15:
				t_of_TA = 70;
				break;
			case 16:
				t_of_TA = 73;
				break;
			case 17:
				t_of_TA = 75;
				break;
			case 18:
				t_of_TA = 78;
				break;
			case 19:
				t_of_TA = 80;
				break;
			case 20:
				t_of_TA = 83;
				break;
			default:
				break;
			}
			switch(GoNextAnswerScreen.D){
			case 0:
				t_of_D = 40;
				break;
			case 1:
				t_of_D = 42;
				break;
			case 2:
				t_of_D = 45;
				break;
			case 3:
				t_of_D = 48;
				break;
			case 4:
				t_of_D = 50;
				break;
			case 5:
				t_of_D = 53;
				break;
			case 6:
				t_of_D = 56;
				break;
			case 7:
				t_of_D = 59;
				break;
			case 8:
				t_of_D = 61;
				break;
			case 9:
				t_of_D = 64;
				break;
			case 10:
				t_of_D = 67;
				break;
			case 11:
				t_of_D = 69;
				break;
			case 12:
				t_of_D = 72;
				break;
			case 13:
				t_of_D = 75;
				break;
			case 14:
				t_of_D = 78;
				break;
			case 15:
				t_of_D = 80;
				break;
			case 16:
				t_of_D = 83;
				break;
			case 17:
				t_of_D = 85;
				break;
			case 18:
				t_of_D = 85;
				break;
			case 19:
				t_of_D = 85;
				break;
			case 20:
				t_of_D = 85;
				break;
			default:
				break;
			}
			switch(GoNextAnswerScreen.AH){
			case 0:
				t_of_AH = 37;
				break;
			case 1:
				t_of_AH = 40;
				break;
			case 2:
				t_of_AH = 42;
				break;
			case 3:
				t_of_AH = 45;
				break;
			case 4:
				t_of_AH = 48;
				break;
			case 5:
				t_of_AH = 50;
				break;
			case 6:
				t_of_AH = 53;
				break;
			case 7:
				t_of_AH = 56;
				break;
			case 8:
				t_of_AH = 58;
				break;
			case 9:
				t_of_AH = 61;
				break;
			case 10:
				t_of_AH = 64;
				break;
			case 11:
				t_of_AH = 66;
				break;
			case 12:
				t_of_AH = 69;
				break;
			case 13:
				t_of_AH = 72;
				break;
			case 14:
				t_of_AH = 74;
				break;
			case 15:
				t_of_AH = 77;
				break;
			case 16:
				t_of_AH = 80;
				break;
			case 17:
				t_of_AH = 82;
				break;
			case 18:
				t_of_AH = 85;
				break;
			case 19:
				t_of_AH = 85;
				break;
			case 20:
				t_of_AH = 85;
				break;
			default:
				break;
			}
			switch(GoNextAnswerScreen.V){
			case 0:
				t_of_V = 27;
				break;
			case 1:
				t_of_V = 30;
				break;
			case 2:
				t_of_V = 32;
				break;
			case 3:
				t_of_V = 35;
				break;
			case 4:
				t_of_V = 37;
				break;
			case 5:
				t_of_V = 39;
				break;
			case 6:
				t_of_V = 42;
				break;
			case 7:
				t_of_V = 44;
				break;
			case 8:
				t_of_V = 46;
				break;
			case 9:
				t_of_V = 49;
				break;
			case 10:
				t_of_V = 51;
				break;
			case 11:
				t_of_V = 54;
				break;
			case 12:
				t_of_V = 56;
				break;
			case 13:
				t_of_V = 58;
				break;
			case 14:
				t_of_V = 61;
				break;
			case 15:
				t_of_V = 63;
				break;
			case 16:
				t_of_V = 66;
				break;
			case 17:
				t_of_V = 68;
				break;
			case 18:
				t_of_V = 70;
				break;
			case 19:
				t_of_V = 73;
				break;
			case 20:
				t_of_V = 75;
				break;
			default:
				break;
			}
			switch(GoNextAnswerScreen.F){
			case 0:
				t_of_F = 36;
				break;
			case 1:
				t_of_F = 38;
				break;
			case 2:
				t_of_F = 40;
				break;
			case 3:
				t_of_F = 42;
				break;
			case 4:
				t_of_F = 44;
				break;
			case 5:
				t_of_F = 46;
				break;
			case 6:
				t_of_F = 48;
				break;
			case 7:
				t_of_F = 51;
				break;
			case 8:
				t_of_F = 53;
				break;
			case 9:
				t_of_F = 55;
				break;
			case 10:
				t_of_F = 57;
				break;
			case 11:
				t_of_F = 59;
				break;
			case 12:
				t_of_F = 61;
				break;
			case 13:
				t_of_F = 63;
				break;
			case 14:
				t_of_F = 66;
				break;
			case 15:
				t_of_F = 68;
				break;
			case 16:
				t_of_F = 70;
				break;
			case 17:
				t_of_F = 72;
				break;
			case 18:
				t_of_F = 74;
				break;
			case 19:
				t_of_F = 76;
				break;
			case 20:
				t_of_F = 78;
				break;
			default:
				break;
			}
			switch(GoNextAnswerScreen.C){
			case 0:
				t_of_C = 40;
				break;
			case 1:
				t_of_C = 42;
				break;
			case 2:
				t_of_C = 45;
				break;
			case 3:
				t_of_C = 48;
				break;
			case 4:
				t_of_C = 50;
				break;
			case 5:
				t_of_C = 53;
				break;
			case 6:
				t_of_C = 56;
				break;
			case 7:
				t_of_C = 59;
				break;
			case 8:
				t_of_C = 61;
				break;
			case 9:
				t_of_C = 64;
				break;
			case 10:
				t_of_C = 67;
				break;
			case 11:
				t_of_C = 69;
				break;
			case 12:
				t_of_C = 72;
				break;
			case 13:
				t_of_C = 75;
				break;
			case 14:
				t_of_C = 78;
				break;
			case 15:
				t_of_C = 80;
				break;
			case 16:
				t_of_C = 83;
				break;
			case 17:
				t_of_C = 85;
				break;
			case 18:
				t_of_C = 85;
				break;
			case 19:
				t_of_C = 85;
				break;
			case 20:
				t_of_C = 85;
				break;
			default:
				break;
			}

		}else if(HearSexScreen.sex == 2){//女性
			switch(GoNextAnswerScreen.TA){
			case 0:
				t_of_TA = 34;
				break;
			case 1:
				t_of_TA = 36;
				break;
			case 2:
				t_of_TA = 39;
				break;
			case 3:
				t_of_TA = 41;
				break;
			case 4:
				t_of_TA = 43;
				break;
			case 5:
				t_of_TA = 45;
				break;
			case 6:
				t_of_TA = 48;
				break;
			case 7:
				t_of_TA = 50;
				break;
			case 8:
				t_of_TA = 52;
				break;
			case 9:
				t_of_TA = 54;
				break;
			case 10:
				t_of_TA = 57;
				break;
			case 11:
				t_of_TA = 59;
				break;
			case 12:
				t_of_TA = 61;
				break;
			case 13:
				t_of_TA = 63;
				break;
			case 14:
				t_of_TA = 66;
				break;
			case 15:
				t_of_TA = 68;
				break;
			case 16:
				t_of_TA = 70;
				break;
			case 17:
				t_of_TA = 72;
				break;
			case 18:
				t_of_TA = 75;
				break;
			case 19:
				t_of_TA = 77;
				break;
			case 20:
				t_of_TA = 79;
				break;
			default:
				break;
			}
			switch(GoNextAnswerScreen.D){
			case 0:
				t_of_D = 39;
				break;
			case 1:
				t_of_D = 42;
				break;
			case 2:
				t_of_D = 44;
				break;
			case 3:
				t_of_D = 47;
				break;
			case 4:
				t_of_D = 49;
				break;
			case 5:
				t_of_D = 51;
				break;
			case 6:
				t_of_D = 54;
				break;
			case 7:
				t_of_D = 56;
				break;
			case 8:
				t_of_D = 59;
				break;
			case 9:
				t_of_D = 61;
				break;
			case 10:
				t_of_D = 63;
				break;
			case 11:
				t_of_D = 66;
				break;
			case 12:
				t_of_D = 68;
				break;
			case 13:
				t_of_D = 71;
				break;
			case 14:
				t_of_D = 73;
				break;
			case 15:
				t_of_D = 75;
				break;
			case 16:
				t_of_D = 78;
				break;
			case 17:
				t_of_D = 80;
				break;
			case 18:
				t_of_D = 83;
				break;
			case 19:
				t_of_D = 85;
				break;
			case 20:
				t_of_D = 85;
				break;
			default:
				break;
			}
			switch(GoNextAnswerScreen.AH){
			case 0:
				t_of_AH = 37;
				break;
			case 1:
				t_of_AH = 40;
				break;
			case 2:
				t_of_AH = 42;
				break;
			case 3:
				t_of_AH = 45;
				break;
			case 4:
				t_of_AH = 48;
				break;
			case 5:
				t_of_AH = 50;
				break;
			case 6:
				t_of_AH = 53;
				break;
			case 7:
				t_of_AH = 55;
				break;
			case 8:
				t_of_AH = 58;
				break;
			case 9:
				t_of_AH = 60;
				break;
			case 10:
				t_of_AH = 63;
				break;
			case 11:
				t_of_AH = 65;
				break;
			case 12:
				t_of_AH = 68;
				break;
			case 13:
				t_of_AH = 70;
				break;
			case 14:
				t_of_AH = 73;
				break;
			case 15:
				t_of_AH = 75;
				break;
			case 16:
				t_of_AH = 78;
				break;
			case 17:
				t_of_AH = 80;
				break;
			case 18:
				t_of_AH = 83;
				break;
			case 19:
				t_of_AH = 85;
				break;
			case 20:
				t_of_AH = 85;
				break;
			default:
				break;
			}
			switch(GoNextAnswerScreen.V){
			case 0:
				t_of_V = 30;
				break;
			case 1:
				t_of_V = 32;
				break;
			case 2:
				t_of_V = 34;
				break;
			case 3:
				t_of_V = 37;
				break;
			case 4:
				t_of_V = 39;
				break;
			case 5:
				t_of_V = 41;
				break;
			case 6:
				t_of_V = 44;
				break;
			case 7:
				t_of_V = 46;
				break;
			case 8:
				t_of_V = 48;
				break;
			case 9:
				t_of_V = 51;
				break;
			case 10:
				t_of_V = 53;
				break;
			case 11:
				t_of_V = 55;
				break;
			case 12:
				t_of_V = 58;
				break;
			case 13:
				t_of_V = 60;
				break;
			case 14:
				t_of_V = 62;
				break;
			case 15:
				t_of_V = 65;
				break;
			case 16:
				t_of_V = 67;
				break;
			case 17:
				t_of_V = 70;
				break;
			case 18:
				t_of_V = 72;
				break;
			case 19:
				t_of_V = 74;
				break;
			case 20:
				t_of_V = 77;
				break;
			default:
				break;
			}
			switch(GoNextAnswerScreen.F){
			case 0:
				t_of_F = 35;
				break;
			case 1:
				t_of_F = 37;
				break;
			case 2:
				t_of_F = 39;
				break;
			case 3:
				t_of_F = 41;
				break;
			case 4:
				t_of_F = 43;
				break;
			case 5:
				t_of_F = 45;
				break;
			case 6:
				t_of_F = 47;
				break;
			case 7:
				t_of_F = 49;
				break;
			case 8:
				t_of_F = 51;
				break;
			case 9:
				t_of_F = 53;
				break;
			case 10:
				t_of_F = 55;
				break;
			case 11:
				t_of_F = 57;
				break;
			case 12:
				t_of_F = 59;
				break;
			case 13:
				t_of_F = 61;
				break;
			case 14:
				t_of_F = 63;
				break;
			case 15:
				t_of_F = 65;
				break;
			case 16:
				t_of_F = 67;
				break;
			case 17:
				t_of_F = 69;
				break;
			case 18:
				t_of_F = 71;
				break;
			case 19:
				t_of_F = 73;
				break;
			case 20:
				t_of_F = 75;
				break;
			default:
				break;
			}
			switch(GoNextAnswerScreen.C){
			case 0:
				t_of_C = 33;
				break;
			case 1:
				t_of_C = 36;
				break;
			case 2:
				t_of_C = 39;
				break;
			case 3:
				t_of_C = 42;
				break;
			case 4:
				t_of_C = 45;
				break;
			case 5:
				t_of_C = 48;
				break;
			case 6:
				t_of_C = 51;
				break;
			case 7:
				t_of_C = 54;
				break;
			case 8:
				t_of_C = 57;
				break;
			case 9:
				t_of_C = 60;
				break;
			case 10:
				t_of_C = 63;
				break;
			case 11:
				t_of_C = 66;
				break;
			case 12:
				t_of_C = 69;
				break;
			case 13:
				t_of_C = 72;
				break;
			case 14:
				t_of_C = 75;
				break;
			case 15:
				t_of_C = 78;
				break;
			case 16:
				t_of_C = 81;
				break;
			case 17:
				t_of_C = 84;
				break;
			case 18:
				t_of_C = 85;
				break;
			case 19:
				t_of_C = 85;
				break;
			case 20:
				t_of_C = 85;
				break;
			default:
				break;
			}
		}
		
		//■を対応T得点に対応する場所に書く
		g.drawRect(80 + ((t_of_TA - 20) * 6) - 2, 40 + 21, 7, 7, Color.BLUE);
		g.drawRect(80 + ((t_of_D - 20) * 6) - 2, 40 + 21 + 42 , 7, 7, Color.BLUE);
		g.drawRect(80 + ((t_of_AH - 20) * 6) - 2, 40 + 21 + (42 * 2) , 7, 7, Color.BLUE);
		g.drawRect(80 + ((t_of_F - 20) * 6) - 2, 40 + 21 + (42 * 3) , 7, 7, Color.BLUE);
		g.drawRect(80 + ((t_of_C - 20) * 6) - 2, 40 + 21 + (42 * 4) , 7, 7, Color.BLUE);
		g.drawRect(80 + ((t_of_V - 20) * 6) - 2, 40 + 21 + (42 * 5) , 7, 7, Color.BLUE);
		
		//■をラインで結ぶ
		g.drawLine(80 + ((t_of_TA - 20) * 6) , 40 + 21,80 + ((t_of_D - 20) * 6) , 40 + 21 + 42 ,Color.BLUE);
		g.drawLine(80 + ((t_of_D - 20) * 6) , 40 + 21 + 42 ,80 + ((t_of_AH - 20) * 6) , 40 + 21 + (42 * 2) ,Color.BLUE);
		g.drawLine(80 + ((t_of_AH - 20) * 6) , 40 + 21 + (42 * 2) ,80 + ((t_of_F - 20) * 6) , 40 + 21 + (42 * 3) , Color.BLUE);
		g.drawLine(80 + ((t_of_F - 20) * 6) , 40 + 21 + (42 * 3) , 80 + ((t_of_C - 20) * 6) , 40 + 21 + (42 * 4), Color.BLUE);
		g.drawLine(80 + ((t_of_C - 20) * 6) , 40 + 21 + (42 * 4) , 80 + ((t_of_V - 20) * 6) , 40 + 21 + (42 * 5) , Color.BLUE);

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