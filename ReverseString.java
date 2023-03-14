package String;

import java.util.Scanner;

public class ReverseString {
	
	public static void reverseAString(String str) {
		int n=str.length();
		
		for(int i=n-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
	}

	public static void main(String[] args) {

               Scanner sc= new Scanner(System.in);
               String str=sc.nextLine();
               reverseAString(str);

	}

}
