package Logical_Exercise_8;



public class ReverseString_8_1 {
	public static void main(String[] args) {
	 	System.out.println(reverse("abc"));
	 	
	 	String word = "abcdef";
	 	String reverseWord ="";
	 	
	 	for(int i =0;i<word.length();i++) {
	 		reverseWord += word.charAt(i);
	 	}
	 	System.out.println(reverseWord);
	}
	public static String reverse(String word) {
		if(word.length() == 0) {
			return word;
		}
		return word.charAt(word.length()-1) + reverse(word.substring(0,word.length()-1));
	}
}
