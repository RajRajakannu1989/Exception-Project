package Exception;

/*
-> try block is used to find and throw the exception
-> Catch is used to catch and handle the Exception
-> printStackTrace()-It is a methood. It is used to getting an address of the exception class
-> finally() is used to execute the important message whether the exception handled or not.
*/
public class Demo {
	public static void main(String[] args) {
		System.out.println("Hi Exception");
		int a = 10;
		System.out.println(a);
		int b = 20;
		int c = 0;
		try {
			int x = a / b;
			System.out.println(x);
			int y = a / c;
			System.out.println(y);

		} catch (Exception ae) {
			System.out.println("Dont try to divide anything by zero");
			ae.printStackTrace();
		}
		System.out.println("Hello Exception");
	}

}
