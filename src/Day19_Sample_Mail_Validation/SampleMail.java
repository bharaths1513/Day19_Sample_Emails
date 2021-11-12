package Day19_Sample_Mail_Validation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SampleMail {

	public static void main(String[] args) {
		Scanner o = new Scanner(System.in);
		System.out.println("Enter Mail id");
		String mail = o.next();
		String regex = "[a-zA-Z0-9][a-zA-Z0-9_[.]]*@[a-zA-Z]+([.][a-zA-Z]+)+";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(mail);
		boolean result = m.matches();
		if (result)
			System.out.println("mail id is valied");
		else
			System.out.println("invalied mail id");
	}
}
