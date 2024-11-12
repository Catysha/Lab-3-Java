import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        File file = new File("input.txt");
        File file1 = new File("output.txt");

        try (FileReader fileReader = new FileReader(file);
             FileWriter fileWriter = new FileWriter(file1);
             BufferedReader bufferedReader = new BufferedReader(fileReader);

             Scanner scanner = new Scanner(System.in)) {

            System.out.print("Задайте длину слова: ");
            int x = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Задайте слово: ");
            String substring = scanner.nextLine();
            ArrayList<String> res = new ArrayList<>();

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(line);
                while (st.hasMoreTokens()) {
                    String substring_1 = st.nextToken();
                    if (substring_1.length() == x) {
                        substring_1 = substring;
                    }
                    fileWriter.write(substring_1 + " ");
                }
                fileWriter.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}