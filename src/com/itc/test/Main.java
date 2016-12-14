package com.itc.test;

import java.io.IOException;
/*
 * Program Entrance
 * 2016-12-13
 * from liguodong
 * */
public class Main {

	private static GameControl game = new GameControl();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			game.startGame();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
