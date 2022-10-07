
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String url = keyboard.nextLine();

        // URL strings for testing
        //String url = "https://youtu.be/RRW2aUSw5vU";
        //String url = "https://www.youtube.com/watch?v=kbxkq_w51PM";

        // split url string into an array
        String[] splitUrl = url.split("");
        //System.out.println(Arrays.toString(splitUrl));

        // locate index of final slash (ie 3rd one) within URL address in array
        int index = 0;
        int slashCount = 0;
        for (int i = 0; slashCount < 3; i++) {
            if (splitUrl[i].equals("/")) {
                slashCount++;
            }
            index = i;
        }


        // ***** MODIFY BELOW USING 'StringBuilder' *****
        /*
        StringBuilder buildID = new StringBuilder();
        for (int i = 0; i < 100; i++)
            myString.append(...blah...);
        String s = myString.toString();
        */

        //System.out.println("Index of final slash: " + index);

        // Check for 'youtu.be' keyword as a match means video ID is located immediately following 3rd '/'.
        Pattern dotPattern = Pattern.compile("youtu.be");
        Matcher searchURL = dotPattern.matcher(url);
        boolean matchFound = searchURL.find();
        StringBuilder build_ID = new StringBuilder();

        if (matchFound) {
            //System.out.println("Match found");
            for (int i = ++index; i <= splitUrl.length - 1; i++) {
                build_ID.append(splitUrl[i]);
            }
            System.out.println("Youtube Video ID: " + build_ID);

        /* if 'youtu.be' keyword not found then assume URL is written as full address hence search
         for index of '=' as video ID immediately follows it. Print all chars following '='.
         */

        } else {
            //System.out.println("Match not found");
            //System.out.println(url.indexOf("="));
            int equalsIndex = url.indexOf("=");
            for (int i = ++equalsIndex; i <= splitUrl.length - 1; i++) {
                build_ID.append(splitUrl[i]);
            }
            System.out.println("Youtube Video ID: " + build_ID);
        }
    }
}
