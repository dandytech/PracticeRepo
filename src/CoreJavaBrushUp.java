
public class CoreJavaBrushUp {

	public static void main(String[] args) {

		// TODO Auto-generated method stub


		//string is an object //String literal


		String s1 = "Rahul Shetty Academy";
		
		System.out.println(s1);
		System.out.println(); //print space
		
		//new
		String s2 = new String("Welcome");
		
		String s = "Rahul Shetty Academy";

		String[] splittedString = s.split("Shetty");

		System.out.println(splittedString[0]);

		System.out.println(splittedString[1]);

		System.out.println(splittedString[1].trim());


		System.out.println(); //print space
		//To reverse the string
		for(int i =s.length()-1;i>=0;i--)

		{


		System.out.println(s.charAt(i));

		}

	}

}


