import java.util.Scanner;

public class MadLibsInputStory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a NAME: ");
        String name = input.nextLine();
        
        System.out.print("Enter a PLACE: ");
        String place = input.nextLine();
        
        System.out.print("Enter a VERB: ");
        String verb = input.nextLine();
        
        System.out.print("Enter an ADJECTIVE: ");
        String adjective = input.nextLine();
        
        System.out.print("Enter a NOUN: ");
        String noun = input.nextLine();
        
        System.out.print("Enter an ADVERB: ");
        String adverb = input.nextLine();
        
        System.out.print("Enter a FEELING: ");
        String feeling = input.nextLine();
        
        System.out.println("\nEnter your template (use [NAME], [PLACE], [VERB], [ADJECTIVE], [NOUN], [ADVERB], [FEELING]):");
        String template = input.nextLine();
        
        String story = template.replace("[NAME]", name)
                               .replace("[PLACE]", place)
                               .replace("[VERB]", verb)
                               .replace("[ADJECTIVE]", adjective)
                               .replace("[NOUN]", noun)
                               .replace("[ADVERB]", adverb)
                               .replace("[FEELING]", feeling);
        
        System.out.println("\n=== YOUR MAD LIB ===");
        System.out.println(story);
        
        input.close();
    }
}
