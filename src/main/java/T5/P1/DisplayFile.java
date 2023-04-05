package T5.P1;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class DisplayFile {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter the file name: ");
        String fileName = "src/main/java/T5/P1/" + userInput.nextLine();

        BufferedReader reader;
        boolean wantToExit;

        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line = reader.readLine();

            while (line != null) {
                System.out.println(line);


                System.out.println("Continue (Enter) or Exit (X)");
                wantToExit = (userInput.nextLine().equals("X"));

                if (wantToExit){
                    break;
                }

                line = reader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
