
public class practStringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		String s3 = "Hello";
		

		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		System.out.println(s1.equals(s2));
		System.out.print(practStringMethods.removeChar("Anuraag_Patil", '_'));
	}

	//Write a method that will remove given character from the String?
	//both inputs to the replaceAll method are string so we convert the char input to string
	
	private static String removeChar(String str, char c) {
        if (str == null)
            return null;
        return str.replaceAll(Character.toString(c), " ");
    }
}
