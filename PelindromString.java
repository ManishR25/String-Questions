package String;

public class PelindromString {
	
	public static boolean StringPelindrom(String str) {
		
			int n=str.length();
			String reverseString="";
			
			for(int i=n-1; i>=0; i--) {
				reverseString = reverseString + str.charAt(i);
			}
			
			if(reverseString.equals(str)) {
				return true;
			}else {
				return false;
			}
		
		
	}

	public static void main(String[] args) {

          String str="abccb";
          
          boolean result=StringPelindrom(str);
          System.out.println(result);

	}

}
