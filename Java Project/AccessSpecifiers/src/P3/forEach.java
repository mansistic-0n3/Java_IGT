package P3;

public class forEach {
	public static void main(String args[]) {
		int a = 100;
		int b = 200;
		int c = 300;
		
		int arr[]= {10, 20, 30, 40, 50};
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("----------------------------");
		for(int x:arr) {
			System.out.println(x);
		}
		System.out.println("----------------------------");
		
		int[] ar = new int[5];
		ar[0]=0;
		ar[1]=100;
		ar[2]=200;
		ar[3]=300;
		ar[4]=400;
		//size is fixed--> COLLECTION
		for(int i=0; i<ar.length;i++) {
			System.out.println(ar[i]);
		}
	}
}
