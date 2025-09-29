package day1;

import java.nio.file.FileSystemNotFoundException;

public class Objectarray {

	public static void main(String[] args) {

		Object a[]= {100, 10.5 ,'A', "WELCOME", true };
		
		for(Object x:a) {
			System.out.println(x);
		}
	}

}
