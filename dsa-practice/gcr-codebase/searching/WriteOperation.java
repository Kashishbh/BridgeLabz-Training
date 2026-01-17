
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
public class WriteOperation {

	public static void main(String[] args) {
		try {
            InputStreamReader input = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(input);

           
            FileWriter fw = new FileWriter("output.txt", true);

            System.out.println("Enter text (type 'exit' to stop):");

            String line;

           
            while (true) {
                line = br.readLine();

                if (line.equalsIgnoreCase("exit")) {
                    break;
                }

                fw.write(line);
                fw.write(System.lineSeparator()); 
            }

            
            fw.close();
            br.close();
            input.close();

            System.out.println("Data written to file successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
