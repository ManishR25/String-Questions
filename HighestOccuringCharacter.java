package String;

public class HighestOccuringCharacter {
	
	public static char HOC(String str) {
		int maxCount = Integer.MIN_VALUE;
		int newCharCount=0;
		char currentChar = 0;
		char newChar = 0;
		//int prevCharCount=0;
		for(int i=0; i<str.length(); i++) {
			newCharCount=0;
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(i) == str.charAt(j)) {
					newCharCount++;	
				}
			}
			//currentChar = str.charAt(i);
			if(maxCount < newCharCount) {
	         	maxCount = newCharCount;
				//System.out.println(maxCount);
				newChar = str.charAt(i);
			}		
		}	
		return newChar;
	}

	public static void main(String[] args) {
		
		String str="bbaa";
		char result = HOC(str);
		System.out.println(result);

	}

}
