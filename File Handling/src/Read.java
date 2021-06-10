

	import java.io.*;
	public class Read {
	public static void main(String[] args) {
		try {
			FileReader FR=new FileReader("C:\\Users\\Abdulrahman\\Desktop\\test\\output.txt");
			
			int x;
			while((x=FR.read())!= -1) {
				System.out.print((char)x);
			}
		}
			catch(Exception ex) {
				
			}
	}
	}


