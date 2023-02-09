package mergeSort;
import java.util.Arrays;
import java.util.Random;

public class MergeSort {
	
	public int[] sort(int[] arr) {
		int length = arr.length;
		if (length <= 1) {
			return arr;
		}
		int mid = Math.floorDiv(length, 2);
		int[] leftArray = Arrays.copyOfRange(arr, 0, mid);
		int[] rightArray = Arrays.copyOfRange(arr, mid, length);
		return merge(sort(leftArray), sort(rightArray));
	}
	
	public int[] merge(int[] left, int[] right) {
		int[] merged = new int[left.length + right.length];
		int leftPos = 0;
		int rightPos = 0;
		int curIndex = 0;
		
		while (leftPos < left.length && rightPos < right.length) {
			if (left[leftPos] < right[rightPos]) {
				merged[curIndex] = left[leftPos];
				leftPos++;
			} else {
				merged[curIndex] = right[rightPos];
				rightPos++;
			}
			curIndex++;
		}
		System.arraycopy(left, leftPos, merged, curIndex, left.length - leftPos);
		System.arraycopy(right, rightPos, merged, curIndex, right.length - rightPos);
		return merged;
	}

	public static void main(String[] args) {
		int[] array = {0,0,0,0,0,0,0,0,0,0};
		Random rand = new Random();
		MergeSort sorter = new MergeSort();
		for (int i = 0; i < 10; i++) {
			int random = rand.nextInt(999);
			array[i] = random;
		}
		System.out.println("Passing in array:");
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(sorter.sort(array)));
	}

}
