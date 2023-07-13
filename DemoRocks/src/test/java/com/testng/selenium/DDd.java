package com.testng.selenium;

import java.util.Arrays;

public class DDd {

	public static void main(String[] args) {

		int[] ar = { 1, 2, 3, 4, 5, 6 };
		int[] b = new int[ar.length];
//			List<Integer> li;
		for (int k = 0, j = 0; k < ar.length; k++) {

			if (ar[k] % 2 == 0) {
				b[j] = ar[k];
				j++;
			}
		}
		System.out.println(Arrays.toString(b));
		for (int i = 0; i < b.length; i++) {
			for (int j = i + 1; j < b.length; j++) {
				int xy = b[i] + b[j];
				System.out.println("xy: " + xy);
				if (Arrays.stream(b).filter(it -> it == xy).findFirst().isPresent()) {
					System.out.println("hello");
					break;
				}
			}
		}

	}

}
