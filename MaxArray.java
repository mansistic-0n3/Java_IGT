import java.io.*;

class MaxArray {
	static int arr[] = { 1, 4, 2, 5, 67, 3, 6, 3, 56, 6, 88 };

	static int largest()
	{
		int i;
		int max = arr[0];
		for (i = 1; i < arr.length; i++)
			if (arr[i] > max)
				max = arr[i];
		return max;
	}
	public static void main(String[] args)
	{
		System.out.println("Largest in given array is "+ largest());
	}
}
