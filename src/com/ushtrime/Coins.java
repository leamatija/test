package com.ushtrime;

import java.util.Scanner;

public class Coins {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Ju lutem jepni numrin e monedhave ose quit");
		String input = scanner.next();
		
		while (!input.equals("quit")) {
			int m = Integer.valueOf(input);
			arrangeCoins(m);
			System.out.println("Ju lutem jepni numrin e monedhave ose quit");
			input = scanner.next();
			
		}
			

	}

	public static int arrangeCoins(int m) {

		int rowFull = 0;
		int count = 1;

		while (m > 0) {
			int coinsToPrint = m - (m - count);

			if (count <= m) {
				for (int i = 0; i < count; i++) {

					System.out.print("*");
				}
				rowFull++;
			} else {
				for (int j = 0; j < m; j++) {
					System.out.print("*");
				}
			}

			System.out.println();

			count++;
			m = m - coinsToPrint;
		}
		System.out.println("Numri i rreshtave te mbushur plot eshte " + rowFull);
		return -1;

	}

}
