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
        
       
        
        System.out.println("\nEnter your template (use [NAME], [PLACE], [VERB], [ADJECTIVE], [NOUN]):");
        String template = input.nextLine();
        String story = template;
        int index; 
        while ((index=story.indexOf("[NAME]")) !=-1){   
            story=story.substring(0,index) + name + story.substring(index+6); 
        }
        while ((index=story.indexOf("[PLACE]")) != -1){
            story=story.substring(0,index) + place + story.substring(index+7);
        }
        while ((index=story.indexOf("[VERB]")) != -1){
            story=story.substring(0,index) + verb + story.substring(index+6);
        }
        while ((index = story.indexOf("[ADJECTIVE]")) != -1){
            story = story.substring(0, index) + adjective + story.substring(index + 11);
        }
        
        while ((index = story.indexOf("[NOUN]")) != -1) {
            story = story.substring(0, index) + noun + story.substring(index + 6);
        }
        System.out.println(" Here is your madlib");
        System.out.println(story);
     
        
        input.close();S
    }
}
//use substring and index 
//parsing works by indexing then substring it and then ask the user about the substring
 // the (0,index) is everything before the place of the [NAME] and the following (index+6) is everything after the [NAME]
// it would then replace it in the middle of before and after essientaly replacing it in the template
 // replaces name in the template the user inputted above. It would run through the input to find the name and returns -1 if it does not find it
