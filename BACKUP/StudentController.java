package T8;

import java.io.DataInput;
import java.util.Scanner;

public class StudentController {
    public void eventLoop() {
        while (true) {
            Scanner userInput = new Scanner(System.in);
            System.out.println("Do you want to continue? (Y/N)");
            if (userInput.nextLine().equals("N")) {
                break;
            }
            else if (userInput.nextLine().equals("Y")) {

            }

        }
    }
}
