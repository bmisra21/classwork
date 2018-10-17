import java.util.Scanner;
public class Main {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		StringManipulator manip1 = new StringManipulator();
		System.out.print ("Welcome to String Manipulator! Type v for noVowels. Type r for reverse: " );
		char response = in.next().charAt(0);
		int contin = 0;
		while (response != 1 && response != 2 && response != 3) {
			System.out.print("Try again: ");
			response = in.nextInt();
		}
		do {
			if (response == 1) {
				System.out.print("Enter the string you want to manipulate: ");
				String str = in.next();
				System.out.println("New String: " + manip1.noVowels(str));
			} else if (response ==2) {
				System.out.print("Enter the string you want to manipulate: ");
				String str = in.next();
				System.out.println("New String: " + manip1.reverse(str));
			}
			System.out.print("Would you like to continue? 1 for yes, 2 for no: ");
			contin = in.nextInt();
		} while (contin == 1);
		System.out.println("Goodbye");
}
}
