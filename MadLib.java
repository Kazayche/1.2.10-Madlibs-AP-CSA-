import java.util.Scanner;

// Madlib code where user inputs get placed in our story template which is shown further down the code file 
public class MadLib
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);   //intializing the scanner use
    
    //  user inputs
    System.out.print("Enter an adjective: ");     // asks user the question wich in this case asks for an adjective 
    String adjective = input.nextLine();  //takes the scanner input of what the user says next 
    
    System.out.print("Enter a noun: ");
    String noun = input.nextLine();
    
    System.out.print("Enter a verb: ");
    String verb = input.nextLine();
    
    System.out.print("Enter a plural noun: ");
    String pluralNoun = input.nextLine();
    
    System.out.print("Enter a number: ");
    String number = input.nextLine();

    
    //  display the story
    System.out.println("\nYour Mad Lib Story:");    //prints a result of the MadLib story given the user inputs 
    System.out.println("My" + adjective +"friend decided to" +verb + number + pluralNoun +"at the park. I couldn't believe my eyes when I saw them trying to lift the" + noun + "!");  // combines the story template and the user inputs and prints it out at the end 
  }
}
