package main;

import java.util.Scanner;

import tv.TVClass;

public class MainClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		TVClass tv = new TVClass();
		while(true) {
			System.out.println("1.tv");
			System.out.println("2.냉장고");
			System.out.println("3.에어컨");
			num=scan.nextInt();
			switch(num){
			case 1:
				tv.display();
				break;
			case 2:break;
			case 3:break;
			}
		}

	}

}
