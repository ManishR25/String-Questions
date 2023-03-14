package String;

import java.util.Scanner;

public class PrintStringChar {
	
	public static void PrintCharString(String str) {
		
		int n=str.length();
		
		for(int i=0; i<n; i++) {
			System.out.print(str.charAt(i) + " ");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        
        PrintCharString(str);
	}

}
