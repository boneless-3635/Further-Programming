package T5.P2;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CompareFile {
    public static void main(String[] args) throws IOException {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter a list of integers");

        StringTokenizer stringTokenizer = new StringTokenizer(userInput.nextLine());
        Integer[] inputIntegers = new Integer[stringTokenizer.countTokens()];
        for (int i = 0; i < inputIntegers.length; i++) {
            inputIntegers[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        userInput.close();

//        Save integer to binary file
        FileOutputStream fout = new FileOutputStream("src/main/java/T5/P2/binary.dat");
        DataOutputStream dout = new DataOutputStream(fout);
        for (Integer inputInteger : inputIntegers) {
            dout.writeInt(inputInteger);
        }
        fout.close();
        dout.close();

//        Save integer to text file
        FileWriter fileWriter = new FileWriter("src/main/java/T5/P2/textint.txt");
        for (Integer inputInteger : inputIntegers) {
            fileWriter.write(inputInteger);
        }
        fileWriter.close();


    }
}
