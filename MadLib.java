import java.util.Scanner;

// This program creates a Mad Libs story by collecting user inputs
// and inserting them into a story template
public class MadLib
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    
    //  user inputs
    System.out.print("Enter an adjective: ");
    String adjective = input.nextLine();
    
    System.out.print("Enter a noun: ");
    String noun = input.nextLine();
    
    System.out.print("Enter a verb: ");
    String verb = input.nextLine();
    
    System.out.print("Enter a plural noun: ");
    String pluralNoun = input.nextLine();
    
    System.out.print("Enter a number: ");
    String number = input.nextLine();
    
    System.out.print("Enter an adverb: ");
    String adverb = input.nextLine();
    
    System.out.print("Enter another noun: ");
    String noun2 = input.nextLine();
    
    //  display the story
    System.out.println("\nYour Mad Lib Story:");
    System.out.println("Once upon a time in a " + adjective + " land, a " + noun + " began to " + verb + ". The " + pluralNoun + " watched as " + number + " " + noun2 + "s danced " + adverb + ".");
  }
}
