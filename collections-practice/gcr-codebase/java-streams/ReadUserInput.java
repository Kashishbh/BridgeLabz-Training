// Read User Input from Console
import java.io.*;
public class ReadUserInput  {

    public static void main(String[] args) {

        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            FileWriter fw = new FileWriter("user_info.txt")
        ) {

            System.out.print("Enter your name: ");
            String name = br.readLine();

            System.out.print("Enter your age: ");
            String age = br.readLine();

            System.out.print("Enter your favorite programming language: ");
            String language = br.readLine();

            fw.write("Name: " + name + System.lineSeparator());
            fw.write("Age: " + age + System.lineSeparator());
            fw.write("Favorite Language: " + language + System.lineSeparator());

            System.out.println("User information saved successfully.");

        } catch (IOException e) {
            System.out.println("Error occurred while reading input or writing to file.");
            e.printStackTrace();
        }
    }
}
