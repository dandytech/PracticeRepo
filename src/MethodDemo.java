
public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodDemo d = new MethodDemo();

		String name = d.getData();

		System.out.println(name);

		//call a method in another class
		MethodDemo2 d1 = new MethodDemo2();
		d1.getCourse();

		getData2();

	}

		public String getData()

		{

		System.out.println ("hello world");

		return "rahul shetty";

		}


		public static String getData2()

		{

		System.out.println ("hello world");

		return "rahul shetty";

		}

}