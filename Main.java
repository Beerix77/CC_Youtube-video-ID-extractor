import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //String url = keyboard.nextLine();

        String test = "https://www.youtube.com/watch?v=RRW2aUSw5vU";

        String[] splitUrl = test.split("");
        System.out.println(Arrays.toString(splitUrl));

        int index = 0;
        int slashCount = 0;
        for (int i = 0; slashCount < 3; i++){
            if (splitUrl[i].equals("/")){
                slashCount++;
            }
        }
        System.out.println(slashCount);







    }
}