package Exception;

public class EligibleException {
	public static void main(String args[])throws AgeException {
			int age=30;
			if(age<=18) {
				throw new AgeException ("not eligible");
			}else {
				System.out.println("eligible");
			}

}
	}
