package String;

import java.util.Scanner;

public class ReverseEachWord {
	
	public static String reverseEachWord(String str) {
		String ans="";
		int currentWordStart = 0;
		int i=0;
		for(; i< str.length(); i++) {
			if(str.charAt(i) == ' ') {
				int currentWordEnd=i-1;
				String reverseWord = "";
				for(int j=currentWordStart; j<= currentWordEnd; j++) {
					reverseWord = str.charAt(j) + reverseWord;
				}
				ans += reverseWord + " ";
				currentWordStart = i+1;
			}
		}
		int currentWordEnd = i - 1;
		String reverseWord = "";
		for(int j=currentWordStart; j<= currentWordEnd; j++) {
			reverseWord = str.charAt(j) + reverseWord;
		}
		ans += reverseWord;
		return ans;
	}

	public static void main(String[] args) {

               Scanner sc=new Scanner(System.in);
               String str=sc.nextLine();
               String reverse=reverseEachWord(str);
               System.out.println(reverse);

	}

}
