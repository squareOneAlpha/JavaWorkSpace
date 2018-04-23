
public class practString {
	
	public static void main(String args[]) {
	
	
		String s1 = "Rakesh";
		String s2 = "Rakesh"; //s1 and s2 referencing to same object in Pool
		String s3 = "Rakesh".intern(); //s1 , s2 and s3 referencing to same object in Pool
		String s4 = new String("Rakesh"); //s4 creates in Heap and referencing to same in Heap
		String s5 = new String("Rakesh").intern(); //again s5 referencing to Literal in Pool so s1, s2, s3 and s5 are referncing to same object in Pool
		String s6 = "AnunA";
		if ( s1 == s2 ){
		System.out.println("1. s1 and s2 are same"+ s1+ "\n"+s2); // 1.
		}

		if ( s1 == s3 ){
		System.out.println("2. s1 and s3 are same"+ s1+ "\n"+s3 ); // 2.
		}

		if ( s1 == s4 ){
			System.out.println("3. s1 and s4 are same"+ s1+ "\n"+s4 ); // 3.
		}else {
			//since S1 and S4 are created in different locations their object reference/ address is different even though they have same value"Rakesh"
			System.out.println("3. s1 and s4 are not same \n S1 created in string pool while s4 is not created in string pool its created in heap "+ s1+ "\n"+s4 ); // 3.
			
		}

		if ( s1 == s5 ){
		System.out.println("4. s1 and s5 are same"+ s1+ "\n"+s5 ); // 4.
		}		
//		using static method so no need to initialise object of the class as we can directly accessit via class name. 
//		practString p= new practString();
		
		System.out.println("5. S6 is pallendrome : "+practString.isPalindrome(s6));
		System.out.println("6. S1 is pallendrome : "+ practString.isPalindrome(s1));
		
		
		System.out.println("7. S6 is pallendrome : "+practString.isPalindromeStrLogic(s6));
		System.out.println("8. S1 is pallendrome : "+ practString.isPalindromeStrLogic(s1));
		
	}

	
	//check if input string is a pallidrome
	
	  private static boolean isPalindrome(String str) {
	        if (str == null)
	            return false;
	        StringBuilder strBuilder = new StringBuilder(str);
	        strBuilder.reverse();
	        return strBuilder.toString().equals(str);
	    }
	  
	  //without using any other class pure logic
	  
	  private static boolean isPalindromeStrLogic(String str) {
	        if (str == null)
	            return false;
	        int length = str.length();
	        System.out.println(length+"  "+length / 2);
	        for (int i = 0; i < length / 2; i++) {

	            if (str.charAt(i) != str.charAt(length - i - 1))
	                return false;
	        }
	        return true;
	    }
	

}


