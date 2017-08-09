import java.util.Scanner;

public class BinarySearchRecursion {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		System.out.println("Enter the elements of the array ");
		int arr[] = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println("Enter the key ");
		int key = scn.nextInt();
		int result = binarySearch(arr, 0, num - 1, key);
		if (result == -1)
			System.out.println("Element is not found at the given position");
		else
			System.out.println("Element is found at the position " + (result + 1));
	}

	public static int binarySearch(int arr[], int l, int h, int key) {
		if (h >= l) {
			int mid = (l + h) / 2;
			if (arr[mid] == key)
				return mid;
			else if (key < arr[mid])
				return binarySearch(arr, l, mid - 1, key);
			else
				return binarySearch(arr, mid + 1, h, key);
		}
		return -1;
	}

}
