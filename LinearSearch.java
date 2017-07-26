package searching;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		System.out.println("Enter the number  of elements");
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		System.out.println("Enter the elements");
		int arr[] = new int[num];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println("Enter the key");
		int key = scn.nextInt();
		int result = linearSearch(arr, key);
		if (result != -1)
			System.out.println("Element is found at the index " + (result + 1));
		else
			System.out.println("Element is not found");
	}

	public static int linearSearch(int arr[], int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key)
				return i;
		}
		return -1;

	}
}
