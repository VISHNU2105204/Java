/*WAJP to read the character from the user and check whether the
character is in upper case and lower case or digit ‘0’ a special character.*/

  import java.util.*;

  public class CheckingCharecterType {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Charecter : ");
		char ch = sc.next().charAt(0);
		
		if(ch>='A' && ch<='Z')
		{
			System.out.println("The Given Charecter Is Uppercase Letter : "+ch);
		}
		
		else if(ch>='a' && ch<='z')
		{
			System.out.println("The Given Charecter Is Lowercase Letter : "+ch);
		}
		
		else if(ch>='0' && ch<='9')
		{
			System.out.println("The Given Charecter Is Digit : "+ch);
		}
		
		else
		{
			System.out.println("The Given Chsrecter Is Special Symbol : ");
		}
	}

}
