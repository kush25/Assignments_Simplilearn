package first;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidations {

	public static final String regex = "[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";

	public static void main(String[] args) {

		List<String> lst = new ArrayList<String>();

		Scanner scn = new Scanner(System.in);

		System.out.println("Enter email ids to check validation");
		System.out.println("Total number email ids to validate: Please indicate below");

		int n = scn.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter an email address");
			String em = scn.next();
			lst.add(em);
		}

		Pattern pattern = Pattern.compile(regex);

		for (String value : lst) {

			Matcher matcher = pattern.matcher(value);

			System.out.println("Email" + " " + value + " " + "is" + " " + (matcher.matches() ? "valid" : "invalid"));
		}

	}
}