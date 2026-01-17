import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
public class ConvertByteStreamToCharacterStream {

	public static void main(String[] args) {
		try {
           FileInputStream fis = new FileInputStream("input.txt");
           InputStreamReader isr =new InputStreamReader(fis, StandardCharsets.UTF_8);
           BufferedReader br = new BufferedReader(isr);
           String line;
           while ((line = br.readLine()) != null) {
                System.out.println(line);
           }
           br.close();
           isr.close();
           fis.close();
		} catch (Exception e) {
            e.printStackTrace();
        }   
            

        
	}

}
