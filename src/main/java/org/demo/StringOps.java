package org.demo;

import java.util.Scanner;

public class StringOps {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		System.out.println(isPalindrome(s1));
	}

	public static boolean isPalindrome(String s) {
		int n = s.length();
		int i = 0;
		while (i < n / 2) {
			if (s.charAt(i) != s.charAt(n - 1 - i)) {
				return false;
			}
			i++;
		}
		return true;
	}

}