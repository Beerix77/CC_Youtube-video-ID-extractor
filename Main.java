import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //String url = keyboard.nextLine();

        String test = "https://youtu.be/RRW2aUSw5vU";
        String test2 = "https://www.youtube.com/watch?v=kbxkq_w51PM";

        String[] splitUrl = test2.split("");
        System.out.println(Arrays.toString(splitUrl));

        int index = 0;
        int slashCount = 0;
        for (int i = 0; slashCount < 3; i++){
            if (splitUrl[i].equals("/")){
                slashCount++;
            }
            index = i;
        }

        System.out.println("Index of final slash: " + index);

        // START HERE BELOW:
        // Regex for 'youtu.be' pattern, ID is located immediately following 3rd slash

        //boolean shortURL = false;
        Pattern dotPattern = Pattern.compile("youtu.be");
        Matcher searchURL = dotPattern.matcher(test2);
        boolean matchFound = searchURL.find();
        if(matchFound) {
            System.out.println("Match found");
            //shortURL = true;
            for (int i = ++index; i <= splitUrl.length-1; i++){
                System.out.print(splitUrl[i]);
            }


        } else {
            System.out.println("Match not found");
            System.out.println(test2.indexOf("="));

        }
    }
}
/* redo:
-do test for '=' in array
if yes then do index of '='
do test for 'youtu.be'

 */