package String;

public class StringComparision {

	public static void main(String[] args) {

            //Strong cases
		
		String str1="abc";
		String str2="abc";
		String str3=new String("abc");
		
		if(str1 == str3) {
			System.out.println("Both are equals");
		}else {
			System.out.println("Both Are not equals");
		}

	}

}
