
package FileHandlingProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



public class FileOps1 {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fileinput = new FileInputStream("Student.txt");
		
		ObjectInputStream objectinput =new ObjectInputStream(fileinput);
		
		Students stu = (Students)objectinput.readObject();
		Students stu1 = (Students)objectinput.readObject();
		Students stu2 = (Students)objectinput.readObject();
		
		System.out.println(stu);
		System.out.println(stu1);
		System.out.println(stu2);

		
		fileinput.close();
		objectinput.close();
		
	}

}