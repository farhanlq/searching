package searching;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		System.out.println("Enter the number of elements");
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		System.out.println("Enter the elements");
		int arr[] = new int[num];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println("Enter the key");
		int key = scn.nextInt();
		int result = binarySearch(arr, key);
		if (result == -1)
			System.out.println("Element is not found at the given position");
		else
			System.out.println("Element is found at index " + (result + 1));

	}

	public static int binarySearch(int arr[], int key) {
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = low + high / 2;
			if (arr[mid] < key)
				low = mid + 1;
			else if (arr[mid] > key)
				high = mid - 1;
			else
				return mid;
		}
		return -1;
	}
}
