package opgave04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        File outfile = new File("resources/numbers.txt2");
        try {
            outfile.createNewFile();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
        PrintWriter writer;
        try {
            writer = new PrintWriter(outfile);
        } catch (FileNotFoundException exception) {
            throw new RuntimeException(exception);
        }
        for (int number = 1; number < 100; number += 2) {
            writer.println(number + " ");
        }
        writer.close();
    }
}
