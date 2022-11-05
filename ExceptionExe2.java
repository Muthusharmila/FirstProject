package Exception;

public class ExceptionExe2 {
	public static void main(String args[]) {
			try {
				String mail="smiley903@gmail.com";
				if(mail=="@gmail.com") {
					throw new MailException ("is not mail");
				}else {
					System.out.println("is mail");
				}
				
			}catch(MailException m) {
			m.printStackTrace();
		}
	}

}
