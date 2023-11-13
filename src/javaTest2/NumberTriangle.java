package javaTest2;

public class NumberTriangle {

	public static void main(String[] args) {
		String input = "abcdefghijklmnopqrstuvw";

		char[] chars = input.toCharArray();
		int length = chars.length;
		int count = 0;
		int k = 0;

		for (int i = 1; i < length; i++) {
			if (length > 0) {
				length = length - i;
				count++;
			}
		}

		for (int i = 0; i < count; i++) {
			for (int j = 0; j < length; j++) {
				if (j <= i) {
					if (k < length) {
						System.out.print(chars[k]);
						k = k + 1;
					} else {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}
	}
}
