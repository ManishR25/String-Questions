package String;

public class RemoveConsecutiveDuplicates {

	public static String removeDuplicate(String str) {
	          
		String newString="";
		char lastChar = str.charAt(0);
		newString = newString + lastChar;
		for(int i=1; i<str.length(); i++) {
			//lastChar = str.charAt(0);
			//newString = newString + lastChar;
			if(str.charAt(i) != lastChar) {
				lastChar = str.charAt(i);
				newString = newString + lastChar;
			}
		}
		return newString;
	}
	
	public static void main(String[] args) {

          String str="aaabbcca";
          String result = removeDuplicate(str);
          System.out.println(result);

	}

}
