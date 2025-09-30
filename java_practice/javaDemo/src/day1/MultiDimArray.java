package day1;

import java.nio.file.FileSystemNotFoundException;

public class MultiDimArray {

	public static void main(String[] args) {

		int a[][]= {{100,200},
				    {300,400},
				    {500,600}};
		
		System.out.println(a[1][1]);
		
//		for(int r=0;r<=2;r++) {
//			
//			for(int c=0;c<=1;c++) {
//				
//				System.out.println(a[r][c]);
//			}
//			
//		}
		
		for(int arr[]:a)
		{
			for(int x:arr)
			{
				System.out.println(x);
			}
		}
		
	}

}
