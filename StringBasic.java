package String;

public class StringBasic {

	public static void main(String[] args) {

          char arr[] = {'c','o','d','i','n','g'};
          String str="abcd";
          String str1="  ";
          String str2="abcda";
          System.out.println(str.equals(str2));
          System.out.println(str.compareTo(str2));
          
          System.out.println(str);
          System.out.println(str.length());
          System.out.println(str.charAt(3));
          System.out.println(str1.length());
          String str3="Coding";
          System.out.println("STR3:"  + str3);
          String str7=str3.substring(1, 2);
          System.out.println("STR3 after:- " + str3);
          System.out.println(str3.substring(3));
          System.out.println(str3.contains("ing"));
          String str4 = str3.substring(2, 5);
          System.out.println(str4);

	}

}
