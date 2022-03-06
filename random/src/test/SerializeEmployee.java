package test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new SerializeEmployee();
	}
	
	public SerializeEmployee() {
		
		Employee e = new Employee(1, "Renuka");
		
		try (ObjectOutputStream s = new ObjectOutputStream(new FileOutputStream("employees.ser")) ) {
			
			s.writeObject(e);
			
		}catch (IOException iox) {
			iox.printStackTrace();
		}
	}
}

