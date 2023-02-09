
package bubbleSort;
import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

	public static int[] bubbleSort(int[] input) {
		
		boolean swapping = true;
		System.out.println("Initial array given:");
		System.out.println(Arrays.toString(input));
		while(swapping) {
			swapping = false;
			for (int i = 0; i < input.length - 1; i++) {
				if (input[i] > input[i+1]) {
					System.out.printf("Swapping pair %d, %d", input[i], input[i+1]);
					Swap.swap(input, i, i + 1);
					System.out.println(Arrays.toString(input));
					swapping = true;
				}
			}
		}
		System.out.println("-------------------------------------");
		System.out.println("Swapping complete!");
		return input;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		Random rand = new Random();
		
		int[] array = {0,0,0,0,0,0,0,0,0,0};
		for (int i=0; i<10; i++) {
			int random = rand.nextInt(999);
			array[i] = random;
		}
		bubbleSort(array);
		System.out.println(Arrays.toString(array));
	}

}
