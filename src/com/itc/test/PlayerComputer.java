package com.itc.test;

import java.util.Random;
/*
 * player computer entity
 * 2016-12-13
 * from liguodong
 * */
public class PlayerComputer extends Player {
	
	public Integer result;
	
	/*computer player make action*/
	public Integer makeAction() {
		
		result = 0;
		
		while (result == 0) {
			result = getInputChoice();
		}
		
		System.out.println("电脑出：  " + getActionText(result));
		return result;
	}
	
	/*computer player make action by random int*/
	public int getInputChoice(){	
		Random rand = new Random();
		int i = Math.abs(rand.nextInt());
		return i%4;
	}
	
	/*computer player choose role*/
	public void chooseCharacter(){
		while(charac==0){
			charac = getInputCharacter();
		}

		System.out.println("电脑角色: " + getCharacterText(charac));
	}
	
	/*computer player get character by random int*/
	public int getInputCharacter(){
		
		Random rand = new Random();
		int i = Math.abs(rand.nextInt());
		return i%4;
	}		
}
