package Exception;

public class ExceptionExe1 {
	public static void main(String args[]) {
		try {
			String Name=null;
			//System.out.println(Name.toUpperCase());
			
		}
		catch (NumberFormatException No) {
			No.printStackTrace();
		}
		System.out.println("end");
	}
}
