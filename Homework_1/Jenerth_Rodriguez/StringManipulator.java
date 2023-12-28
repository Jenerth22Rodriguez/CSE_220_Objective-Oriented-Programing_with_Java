
import java.util.Scanner;

public class StringManipulator {
    public static void main(String[] args) {
        Scanner Userinput = new Scanner(System.in); 
            System.out.print("Please input a string: ");
            String str = Userinput.nextLine();

            int length = str.length();
            String upperCase = str.toUpperCase();
            String fiveStrings = str.substring(0, 5);

            System.out.println("Number of characters: " + length);
            System.out.println("Uppercase: " + upperCase);
            System.out.println("First five characters: " + fiveStrings);
        }
    }
