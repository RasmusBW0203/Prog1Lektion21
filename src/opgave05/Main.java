package opgave05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Skriv list med tal, som er positive og slut af med et negativt tal: ");
        File outfile = new File("resources/TalFraTastatur.txt3");
        try {
            outfile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        PrintWriter writer;
        try (Scanner scanner = new Scanner(System.in);) {
            writer = new PrintWriter(outfile);
            int number = 0;
            while (number >= 0) {
                number = scanner.nextInt();
                if (number >= 0) {
                    writer.println(number);
                }
            }
            writer.close();

        } catch (NoSuchElementException | FileNotFoundException exception) {
            throw new RuntimeException(exception);
        }
    }
}