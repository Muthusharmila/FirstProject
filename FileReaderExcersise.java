package Exception;

import java.io.FileReader;

public class FileReaderExcersise {
public static void main(String args[]) throws Exception{
	FileReader f=new FileReader("D:smiley.txt");
	int i;
	while((i=f.read())!=-1)
		System.out.print((char)i);
	f.close();
}
}
