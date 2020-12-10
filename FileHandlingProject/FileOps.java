package FileHandlingProject;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


//Writing to a File
public class FileOps {
	
	public static void main(String[] args) throws IOException {
		
		Students stu = new Students(1,"Kush","Irvine","k@g.com");
		Students stu1 = new Students(2,"ABC","Irvine","ABC@g.com");
		Students stu2 = new Students(3,"Mark","Irvine","mark@g.com");
		
		
		FileOutputStream fout = new FileOutputStream("Student.txt");
		
		ObjectOutputStream Objectotp = new ObjectOutputStream(fout);
		
		Objectotp.writeObject(stu);
		Objectotp.writeObject(stu1);
		Objectotp.writeObject(stu2);
		
		System.out.println("Data Successfully Entered");
		
		fout.close();
		Objectotp.close();
		
	}

}
