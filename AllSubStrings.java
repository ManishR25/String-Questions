package String;

public class AllSubStrings {
	
	public static void SubStrings(String str) {
		
		int startIndex=0;
		int endIndex=0;
		
	        while(startIndex < str.length() && endIndex < str.length()) {
	        	while(endIndex < str.length()) {
					System.out.print(str.substring(startIndex, endIndex + 1) + " ");
					endIndex++;
				}
				startIndex = startIndex + 1;
				endIndex = startIndex;
				
	        }
	        }   
	

	public static void main(String[] args) {


		String str="abcdefg";
		SubStrings(str);

	}

}
