package javaFestival;

import java.util.Random;

public class ex18 {

	public static void main(String[] args) {
		Random rd = new Random();
		
		for (int i = 0; i < 7; i++) {
			System.out.println(rd.nextInt(45)+1);
		}

	}

}
