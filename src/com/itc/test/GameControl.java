package com.itc.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * Game control center
 * 2016-12-13
 * from liguodong
 * */
public class GameControl {

	/*player human*/
	private Player manPlayer = new PlayerMan();
	/*player computer*/
	private Player computerPlayer = new PlayerComputer();
	/*tie count*/
	private Integer countTie = 0;
	/*whether to continue game*/
	private Boolean continueGame = true;
	
	public void displayTitle(){
		System.out.println("**********************猜拳游戏***********************");
	}
	
	public void displayResult(){

		/*display game result*/
		System.out.println("***************************************");
		System.out.println("游戏结果");
		System.out.println("选手得分: " + manPlayer.getScore());
		System.out.println("电脑得分: " + computerPlayer.getScore());
		System.out.println("平局："+ countTie);
		System.out.println("***************************************");
	}
	
	/*start game and run game*/
	public void startGame() throws IOException{
		
		displayTitle();
		
		/*player choose character*/
		manPlayer.chooseCharacter();
		computerPlayer.chooseCharacter();
		
		/*start the game loop*/
		while(continueGame){
			Integer result = manBeatComputer(manPlayer.makeAction(), computerPlayer.makeAction());
			if(result == 1){
				manPlayer.setScore(manPlayer.getScore()+1);
			}else if(result == 0){
				countTie++;
			}else if(result == -1){
				computerPlayer.setScore(computerPlayer.getScore()+1);
			}
			continueGame = compete();
		}
		
		displayResult();
	}
	
	/*get input decide whether to terminate the program*/
	public boolean compete() throws IOException{
		
		Integer result = -1;
		
		while(result == -1){
			result = getTerminateAction();
		}
		
		if(result == 1){
			return true;
		}else if(result == 0){
			return false;
		}else{
			return false;
		}
	}
	
	/*get input value from console*/
	public Integer getTerminateAction() throws IOException{
		
		BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("请选择是否继续 y/n: ");
		String str = strin.readLine();
		if(str.equals("y")){
			return 1;
		}else if(str.equals("n")){
			return 0;
		}else{
			return -1;
		}
	}
	
	/*check the result -- which side win*/
	public Integer manBeatComputer(Integer manChoice, Integer computerChoice){
		
		if(manChoice == 1 && computerChoice == 3){
			return 1;
		}else if(manChoice == 2 && computerChoice == 1){
			return 1;
		}else if(manChoice == 3 && computerChoice == 2){
			return 1;
		}else if(manChoice == 1 && computerChoice == 1){
			return 0;
		}else if(manChoice == 2 && computerChoice == 2){
			return 0;
		}else if(manChoice == 3 && computerChoice == 3){
			return 0;
		}else {
			return -1;
		}
	}
	
}
