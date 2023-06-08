// WAP to create an array of 5 integer elements. insert from user and print all 5 elements.

package Array_01;

import java.io.*;

public class Program02 {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 5 Integer elements: ");
		int arr[] = new int[5];
		
		for(int i=0; i<5; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("Array elements are: ");
		for(int i=0; i<5; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
