
import java.io.*;
import java.nio.charset.StandardCharsets;
public class Comparison {

	public static void main(String[] args) {
		int N = 1_000_000;

        
        long startSB = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append("hello");
        }
        long endSB = System.nanoTime();
        long timeSB = (endSB - startSB) / 1_000_000;

       
        long startSBF = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < N; i++) {
            sbf.append("hello");
        }
        long endSBF = System.nanoTime();
        long timeSBF = (endSBF - startSBF) / 1_000_000;

        System.out.println("StringBuilder time: " + timeSB + " ms");
        System.out.println("StringBuffer  time: " + timeSBF + " ms");
        String fileName = "input.txt";

        
        long startFR = System.nanoTime();
        int wordCountFR = 0;
		try {
			wordCountFR = countWordsUsingFileReader(fileName);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
        long endFR = System.nanoTime();
        long timeFR = (endFR - startFR) / 1_000_000;

       
        long startISR = System.nanoTime();
        int wordCountISR = 0;
		try {
			wordCountISR = countWordsUsingInputStreamReader(fileName);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
        long endISR = System.nanoTime();
        long timeISR = (endISR - startISR) / 1_000_000;

        System.out.println("\nFileReader word count: " + wordCountFR);
        System.out.println("FileReader time      : " + timeFR + " ms");

        System.out.println("\nInputStreamReader word count: " + wordCountISR);
        System.out.println("InputStreamReader time      : " + timeISR + " ms");
	}
	public static int countWordsUsingFileReader(String fileName) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        int count = 0;
        String line;

        while ((line = br.readLine()) != null) {
            String[] words = line.trim().split("\\s+");
            if (!line.isEmpty()) {
                count += words.length;
            }
        }
        br.close();
        return count;
    }
	public static int countWordsUsingInputStreamReader(String fileName) throws Exception {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(fileName),
                        StandardCharsets.UTF_8));

        int count = 0;
        String line;

        while ((line = br.readLine()) != null) {
            String[] words = line.trim().split("\\s+");
            if (!line.isEmpty()) {
                count += words.length;
            }
        }
        br.close();
        return count;
    }
}
