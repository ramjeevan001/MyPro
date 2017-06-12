package com.pro;

import java.util.Scanner;

public class Project {

	public static void main(String[] args) {
		
		System.out.println("Welcome to this project..!!!");
		
		System.out.println("Enter your first name...");
		
		Scanner scanner = new Scanner(System.in);
		
		String username = scanner.nextLine();
		
		System.out.println("Hey " + username + ", you are so lucky");

	}

}
