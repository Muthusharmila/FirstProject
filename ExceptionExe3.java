package Exception;

public class ExceptionExe3 {
	public static void main(String args[]) {
		try {
			int age=10;
			if(age<=18) {
				throw new AgeException ("not eligible");
			}else {
				System.out.println("eligible");
			}
			
		}catch(AgeException e) {
		e.printStackTrace();
	}
	}
}
