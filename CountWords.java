package String;

import java.util.Scanner;

public class CountWords {

	
	public static int WordsCount(String str) {
		
		int n=str.length();
		int count=1;
		if(n==0) {
			return 0;
		}
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == ' ') {
				count++;
			}	
		}
		
		return count;
	}
	public static void main(String[] args) {

           Scanner sc=new Scanner(System.in);
           String str=sc.nextLine();
           
           int count=WordsCount(str);
           System.out.println(count);

	}

}
