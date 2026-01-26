//Store and Retrieve Primitive Data

import java.io.*;
public class DataStreams {

    public static void main(String[] args) {

        String fileName = "student.dat";

        // -------- Writing Data --------
        try (DataOutputStream dos =
                     new DataOutputStream(new FileOutputStream(fileName))) {

            int rollNo = 11;
            String name = "Yashi";
            double gpa = 7;

            dos.writeInt(rollNo);
            dos.writeUTF(name);
            dos.writeDouble(gpa);

            System.out.println("Student data written successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // -------- Reading Data --------
        try (DataInputStream dis =
                     new DataInputStream(new FileInputStream(fileName))) {

            int rollNo = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();

            System.out.println("\nRetrieved Student Data:");
            System.out.println("Roll No: " + rollNo);
            System.out.println("Name: " + name);
            System.out.println("GPA: " + gpa);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
