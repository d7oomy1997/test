
import java.io.*;


public class Write {

	public static void main(String[] args) {
		try {
		FileWriter FW=	new FileWriter("C:\\Users\\Abdulrahman\\Desktop\\test\\output.txt");

		FW.write("I ");
		FW.write("Love ");
		FW.write("Me");
		FW.close();
	}
		catch(Exception ex) {
			
		}
	}

}
