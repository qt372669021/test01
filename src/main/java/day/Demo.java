package day;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50 };
		System.out.println(Arrays.toString(a));

		System.out.println("×î´óÖµ£º"+getMax(a));

	}

	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}
