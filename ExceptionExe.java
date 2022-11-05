package Exception;

public class ExceptionExe {
	public static void main(String args[]) {
		try {
			int num1=10;
			int num2=0;
			System.out.println(num1/num2);
		}catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e);
		}
		System.out.println("program end");
	}

}
