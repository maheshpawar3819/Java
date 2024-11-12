package com.game.main;

import java.util.Scanner;
import java.util.Random;

public class Game {

	public void start() {
		System.out.println("******Welcome to Stone Paper Scissor******");

		System.out.println(" 1. Stone \n 2. Paper \n 3. Scissor");

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your choise :: ");
		int x = sc.nextInt();

		Game g1 = new Game();
		String user = g1.choise(x);

		Random r = new Random();
		int y = r.nextInt(1, 4); // 1,2,3

		String comp = g1.choise(y);

		g1.decision(user, comp);
		System.out.println("***********************************************");
		System.out.println("Thank you for playing");

	}

	public String choise(int x) {
		String s = null;

		if (x == 1) {
			s = "stone";
		} else if (x == 2) {
			s = "paper";
		} else if (x == 3) {
			s = "scissor";
		} else {
			System.out.println("Invalid input");
		}

		return s;
	}
	
	public void decision(String user,String comp) {
		if ((user.equals("stone") && comp.equals("paper")) || 
				(user.equals("paper") && comp.equals("scissor"))|| 
				(user.equals("scissor") && comp.equals("stone"))) 
			{
				System.out.println("Computer Won the Game");
			} 
			else if ((comp.equals("stone") && user.equals("paper")) || 
					   (comp.equals("paper") && user.equals("scissor"))
					|| (comp.equals("scissor") && user.equals("stone"))) 
			{
				System.out.println("You Won the Game");

			} else {
				System.out.println("both had selected same choise so Game is tie");
			  }

			System.out.println("Computer's Choise :: " + comp);
			System.out.println("User's Choise :: " + user);
	}

}