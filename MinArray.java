import java.io.*;

class MinArray {
	static int arr[] = { 1, 4, 2, 5, 67, 3, 6, 3, 56, 6, 88 };

	static int smallest()
	{
		int i;
		int min = arr[0];
		for (i = 1; i < arr.length; i++)
			if (arr[i] < min)
				min = arr[i];
		return min;
	}
	public static void main(String[] args)
	{
		System.out.println("Smallest in given array is "+ smallest());
	}
}
