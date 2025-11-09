package opgave03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("resources/numbers.txt");
        ArrayList<Integer> list = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextInt()) {
                list.add(scanner.nextInt());
            }
        } catch (FileNotFoundException exception) {
            throw new RuntimeException(exception);
        }
        System.out.println(list);
    }
}
