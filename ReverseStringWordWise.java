package String;

public class ReverseStringWordWise {

	public static String ReverseWord(String str) {
		String ans="";
		int i=str.length()-1;
		int endWord = str.length();
		for(; i>=0; i--) {
			if(str.charAt(i) == ' ') {
				int startWord = i + 1;
				String reverseWord="";
				for(int j=startWord; j<endWord; j++) {
					reverseWord = reverseWord + str.charAt(j);
				}
				ans +=reverseWord + " ";
				endWord = i;
			}
		}
		int startWord=i+1;
		String reverseWord = "";
		for(int j=startWord; j< endWord; j++) {
			reverseWord = reverseWord + str.charAt(j);
		}
		ans += reverseWord;
		
		return ans;
	}
	
	public static void main(String[] args) {

         String str="ABC DEF GHI JKL MNO PQR";
         String reverse=ReverseWord(str);
         System.out.println(reverse);
		

	}

}
