package String;

public class CompressTheString {
	
	public static String compressString(String str) {
		String newString = "";
		int newCharCount=0;
		int currentCount=0;
		String currentChar="";
		int prevCount=0;
		int startIndex = 0;
		int i=0;
		while(i<str.length()) {
			newCharCount = 0;
			int j=i;
			while(j < str.length()) {
				if(str.charAt(i) == str.charAt(j)) {
				newCharCount++;	
				}
				j++;
			}
			if(newCharCount == 1) {
				currentChar = currentChar + str.charAt(i);
				newString = currentChar;
				startIndex += newCharCount;
				i=startIndex;
			}else {
				currentChar = currentChar + str.charAt(i) + newCharCount;
				newString = currentChar;
				startIndex += newCharCount;
				i=startIndex;
			}
			
		}
		return newString;
		

	
	}
	public static void main(String[] args) {
		
		String str= "aaabbccdsa";
		String result = compressString(str);
		System.out.println(result);

	}

}
