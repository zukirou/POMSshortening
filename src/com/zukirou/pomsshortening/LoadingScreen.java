package com.zukirou.pomsshortening;

import com.zukirou.gameFrameWork.Game;
import com.zukirou.gameFrameWork.Graphics;
import com.zukirou.gameFrameWork.Screen;
import com.zukirou.gameFrameWork.Graphics.PixmapFormat;
import com.zukirou.pomsshortening.Assets;

public class LoadingScreen extends Screen{
	public LoadingScreen(Game game){
		super(game);
	}
	
	@Override
	public void update(float deltaTime){
		Graphics g = game.getGraphics();
		Assets.POMSshorteningTitle = g.newPixmap("POMSshorteningTitle.png", PixmapFormat.RGB565);
		Assets.hajimeru	=	g.newPixmap("hajimeru.png", PixmapFormat.ARGB4444);
		Assets.select_0	=	g.newPixmap("select_0.png", PixmapFormat.ARGB4444);
		Assets.select_1	=	g.newPixmap("select_1.png", PixmapFormat.ARGB4444);
		Assets.select_2	=	g.newPixmap("select_2.png", PixmapFormat.ARGB4444);
		Assets.select_3	=	g.newPixmap("select_3.png", PixmapFormat.ARGB4444);
		Assets.select_4	=	g.newPixmap("select_4.png", PixmapFormat.ARGB4444);
		Assets.select_0push	=	g.newPixmap("select_0push.png", PixmapFormat.ARGB4444);
		Assets.select_1push	=	g.newPixmap("select_1push.png", PixmapFormat.ARGB4444);
		Assets.select_2push	=	g.newPixmap("select_2push.png", PixmapFormat.ARGB4444);
		Assets.select_3push	=	g.newPixmap("select_3push.png", PixmapFormat.ARGB4444);
		Assets.select_4push	=	g.newPixmap("select_4push.png", PixmapFormat.ARGB4444);
		Assets.nextquestion	=	g.newPixmap("nextquestion.png", PixmapFormat.ARGB4444);
		Assets.endquestion	=	g.newPixmap("endquestion.png", PixmapFormat.ARGB4444);
		Assets.allanswerend	=	g.newPixmap("allanswerend.png", PixmapFormat.ARGB4444);
		Assets.buttonup	=	g.newPixmap("buttonup.png", PixmapFormat.ARGB4444);
		Assets.buttondown	=	g.newPixmap("buttondown.png", PixmapFormat.ARGB4444);
		Assets.button01	=	g.newPixmap("button01.png", PixmapFormat.ARGB4444);
		Assets.button02	=	g.newPixmap("button02.png", PixmapFormat.ARGB4444);
		Assets.button03	=	g.newPixmap("button03.png", PixmapFormat.ARGB4444);
		Assets.button04	=	g.newPixmap("button04.png", PixmapFormat.ARGB4444);
		Assets.button05	=	g.newPixmap("button05.png", PixmapFormat.ARGB4444);
		Assets.button06	=	g.newPixmap("button06.png", PixmapFormat.ARGB4444);
		Assets.button07	=	g.newPixmap("button07.png", PixmapFormat.ARGB4444);
		Assets.button08	=	g.newPixmap("button08.png", PixmapFormat.ARGB4444);
		Assets.button09 =	g.newPixmap("button09.png", PixmapFormat.ARGB4444);
		Assets.button10	=	g.newPixmap("button10.png", PixmapFormat.ARGB4444);
		Assets.button11	=	g.newPixmap("button11.png", PixmapFormat.ARGB4444);
		Assets.button12	=	g.newPixmap("button12.png", PixmapFormat.ARGB4444);
		Assets.button13	=	g.newPixmap("button13.png", PixmapFormat.ARGB4444);
		Assets.button14	=	g.newPixmap("button14.png", PixmapFormat.ARGB4444);
		Assets.button15	=	g.newPixmap("button15.png", PixmapFormat.ARGB4444);
		Assets.button16	=	g.newPixmap("button16.png", PixmapFormat.ARGB4444);
		Assets.button17	=	g.newPixmap("button17.png", PixmapFormat.ARGB4444);
		Assets.button18	=	g.newPixmap("button18.png", PixmapFormat.ARGB4444);
		Assets.button19	=	g.newPixmap("button19.png", PixmapFormat.ARGB4444);
		Assets.button20	=	g.newPixmap("button20.png", PixmapFormat.ARGB4444);
		Assets.button21	=	g.newPixmap("button21.png", PixmapFormat.ARGB4444);
		Assets.button22	=	g.newPixmap("button22.png", PixmapFormat.ARGB4444);
		Assets.button23	=	g.newPixmap("button23.png", PixmapFormat.ARGB4444);
		Assets.button24	=	g.newPixmap("button24.png", PixmapFormat.ARGB4444);
		Assets.button25	=	g.newPixmap("button25.png", PixmapFormat.ARGB4444);
		Assets.button26	=	g.newPixmap("button26.png", PixmapFormat.ARGB4444);
		Assets.button27	=	g.newPixmap("button27.png", PixmapFormat.ARGB4444);
		Assets.button28	=	g.newPixmap("button28.png", PixmapFormat.ARGB4444);
		Assets.button29	=	g.newPixmap("button29.png", PixmapFormat.ARGB4444);
		Assets.button30	=	g.newPixmap("button30.png", PixmapFormat.ARGB4444);
		Assets.revisionend	=	g.newPixmap("revisionend.png", PixmapFormat.ARGB4444);
		Assets.dansei	=	g.newPixmap("dansei.png", PixmapFormat.ARGB4444);
		Assets.jyosei	=	g.newPixmap("jyosei.png", PixmapFormat.ARGB4444);
		Assets.yes	=	g.newPixmap("yes.png", PixmapFormat.ARGB4444);
		Assets.no	=	g.newPixmap("no.png", PixmapFormat.ARGB4444);
		Assets.mood	=	g.newPixmap("mood.png", PixmapFormat.ARGB4444);
		Assets.rulerscore	=	g.newPixmap("rulerscore.png", PixmapFormat.ARGB4444);
		Assets.revisionnow	=	g.newPixmap("revisionnow.png", PixmapFormat.ARGB4444);
		Assets.moodparam	=	g.newPixmap("moodparam.png", PixmapFormat.ARGB4444);
		
		Settings.load(game.getFileIO());
		game.setScreen(new MainMenuScreen(game));
	}
	
	@Override
	public void present(float deltaTime){
		
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