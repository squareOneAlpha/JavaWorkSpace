
public class practString {
	
	public static void main(String args[]) {
	
		
		
		
		String s1 = "Rakesh";
		String s2 = "Rakesh"; //s1 and s2 referencing to same object in Pool
		String s3 = "Rakesh".intern(); //s1 , s2 and s3 referencing to same object in Pool
		String s4 = new String("Rakesh"); //s4 creates in Heap and referencing to same in Heap
		String s5 = new String("Rakesh").intern(); //again s5 referencing to Literal in Pool so s1, s2, s3 and s5 are referncing to same object in Pool

		if ( s1 == s2 ){
		System.out.println("s1 and s2 are same"+ s1+ "\n"+s2); // 1.
		}

		if ( s1 == s3 ){
		System.out.println("s1 and s3 are same"+ s1+ "\n"+s3 ); // 2.
		}

		if ( s1 == s4 ){
		System.out.println("s1 and s4 are same"+ s1+ "\n"+s4 ); // 3.
		}

		if ( s1 == s5 ){
		System.out.println("s1 and s5 are same"+ s1+ "\n"+s5 ); // 4.
		}		
		
	}
	
	

}


