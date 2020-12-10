package FileHandlingProject;

import java.io.Serializable;

public class Students implements Serializable {

	private int stuID;
	private String stuName;
	private String stuCity;
	private String stuEmail;
	
	
	public Students(int stuID, String stuName, String stuCity, String stuEmail) {
		super();
		this.stuID = stuID;
		this.stuName = stuName;
		this.stuCity = stuCity;
		this.stuEmail = stuEmail;
	}


	@Override
	public String toString() {
		return "Students [stuID=" + stuID + ", stuName=" + stuName + ", stuCity=" + stuCity + ", stuEmail=" + stuEmail
				+ "]";
	}
	
	

	
}
