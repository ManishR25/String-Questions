package String;

public class removeCharacter {
	
	public static String removeChar(String str, char ch) {
		
		char removechar = ch;
		String newString="";
		
		for(int i=0; i< str.length(); i++ ) {
			if(str.charAt(i) != removechar) {
				newString = newString + str.charAt(i); 
			}
		}
		return newString;
	}

	public static void main(String[] args) {

                 String str = "abcabc";
                 char ch='a';
                 
                 String result = removeChar(str, ch);
                 System.out.println(result);
	}

}
