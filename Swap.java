package bubbleSort;

public class Swap {

	public static void swap(int[] input, int indexOne, int indexTwo) {
		int temp = input[indexTwo];
		input[indexTwo] = input[indexOne];
		input[indexOne] = temp;
	}
}
