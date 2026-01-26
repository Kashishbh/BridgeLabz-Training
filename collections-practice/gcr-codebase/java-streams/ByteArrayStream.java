//Convert Image to ByteArray
import java.io.*;
public class ByteArrayStream{

    public static void main(String[] args) {

        File sourceImage = new File("original.jpg");
        File newImage = new File("copy.jpg");

        if (!sourceImage.exists()) {
            System.out.println("Source image does not exist.");
            return;
        }

        try (
            FileInputStream fis = new FileInputStream(sourceImage);
            ByteArrayOutputStream baos = new ByteArrayOutputStream()
        ) {

            // Read image into byte array
            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            byte[] imageBytes = baos.toByteArray();

            // Write byte array back to image
            try (
                ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
                FileOutputStream fos = new FileOutputStream(newImage)
            ) {
                while ((bytesRead = bais.read(buffer)) != -1) {
                    fos.write(buffer, 0, bytesRead);
                }
            }

            System.out.println("Image converted to byte array and written successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
