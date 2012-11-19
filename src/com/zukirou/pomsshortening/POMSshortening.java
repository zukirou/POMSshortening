package com.zukirou.pomsshortening;

import com.zukirou.gameFrameWork.Screen;
import com.zukirou.games.impl.AndroidGame;

public class POMSshortening extends AndroidGame {
	
	@Override
	public Screen getStartScreen(){
		return new LoadingScreen(this);
	}

}
