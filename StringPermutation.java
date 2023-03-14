package String;

public class StringPermutation {
	
	public static boolean permutation(String str1, String str2) {
		
		int l1=str1.length();
		int l2=str2.length();
		int count=0;
		for(int i=0; i<l1; i++) {
			for(int j=0; j<l2; j++) {
				if(str1.charAt(i) == str2.charAt(j)) {
					count++;
				}
			}
		}
		if(count == str1.length() && count == str2.length()) {
			return true;
		}
		
		return false;
	}

	public static void main(String[] args) {

        String str1="abcd";
        String str2="cdba";
        
        boolean result = permutation(str1, str2);
        System.out.println(result);

	}

}
