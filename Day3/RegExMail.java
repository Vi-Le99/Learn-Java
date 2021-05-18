package Am;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//link tham khảo:https://www3.ntu.edu.sg/home/ehchua/programming/howto/Regexe.html
public class RegExMail {
	public static String getMail() {
		Scanner aScanner =new Scanner(System.in);
		String mail= "";
		while (true) {
			System.out.println("input email: ");
			mail=aScanner.nextLine();
			
			// vd, nhập mail chữ cái đầu tiên bắt buộc phải là chữ	
			
			Pattern p = Pattern.compile("^[a-zA-Z][a-zA-Z0-9]+@[a-zA-Z]+(\\.[a-zA-Z]+){1,3}$");
			if(p.matcher(mail).find()) {
				break;
			}else {
				System.err.println("invalid mail, please input again: ");
			}
		}
		return mail;
	}
	public static void main(String[] args) {
		String mailString=getMail();
		System.out.println("mail: "+mailString);
	}
}
