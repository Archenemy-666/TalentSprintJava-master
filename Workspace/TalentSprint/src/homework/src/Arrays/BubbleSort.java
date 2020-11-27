package Arrays;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] array = { 1, 10, 32, 4, 2 };

		int[] sortedArray = bubbleSort(array);
		System.out.println(Arrays.toString(sortedArray));

	}

	public static int[] bubbleSort(int[] array) {
		int i, j, temp = 0;
		for (i = 1; i < array.length; i++) {
			for (j = (array.length - 1); j >= i; j--) {
				if (array[j - 1] > array[j]) {
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}

			}
		}
		return array;

	}

}
