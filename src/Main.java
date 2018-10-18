import java.util.Scanner;
public class Main {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		StringManipulator manip1 = new StringManipulator();
		System.out.print ("Welcome to String Manipulator! Type v for noVowels. Type r for reverse: " );
		char response = in.next().charAt(0);
		char responseyn;
		boolean response1;
		String str;
		while (response != 'v' && response != 'r') 
		{
			System.out.print("Try again: ");
			response = in.next().charAt(0);
		}
		response1 = true;
		while (response1)
		{
			System.out.print("Enter a string to change: ");
			str = in.next();
			if (response == 'v') 
			{
				System.out.println("String without vowels: "+ manip1.noVowels(str) );
			} else 
			{
				System.out.println("String reversed: "+ manip1.reverse(str) );
			}
			System.out.print("Do you want to play again? y for yes, n for no: ");	
			responseyn = in.next().charAt(0);
			while (responseyn != 'y' && responseyn != 'n') 
			{
				System.out.print("Try again: ");
				responseyn = in.next().charAt(0);
			}
			if (responseyn == 'y')
			{
				response1 = true;
				System.out.print("Type v for noVowels. Type r for reverse: ");
				response = in.next().charAt(0);
			} else {response1 = false;}
		}
		System.out.println("Goodbye!");
	}
	
}
