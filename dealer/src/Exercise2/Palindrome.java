package Exercise2;


public class Palindrome {
	

	Palindrome(String p) {
		// TODO Auto-generated constructor stub
	
	}

	private static String stripPalindrome(String palindrome){
		return palindrome.toLowerCase().replaceAll("[^a-zA-Z0-9s+]", "");
	}
	
	private static String reversePalindrome(String palindrome){
		return new StringBuilder(palindrome).reverse().toString();
	}
	
	public static boolean isPalindrome(String palindrome) {
		String strippedPalindrome = stripPalindrome(palindrome);
		
		if (strippedPalindrome.equals(reversePalindrome(strippedPalindrome))) return true;
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("Ah, Satan sees Natasha"));
		System.out.println(isPalindrome("pjhyup"));
		System.out.println(isPalindrome("pop"));		
		System.out.println(isPalindrome("good day!"));	
	
	}
}
