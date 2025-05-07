import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PrintWriterTest {
    public static void main(String[] args) {
        try {
            PrintWriter printWriter = new PrintWriter("E:\\hello_file\\printWriterTest.txt");
            printWriter.println("hello from java");
            printWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }

        try (PrintWriter anotherWriter =  new PrintWriter("E:\\hello_file\\anotherFile.txt")) {
            anotherWriter.println("hello again from java");
        } catch (FileNotFoundException e ) {
            System.out.println("file not found");
        }

        File file = new File("E:\\hello_file\\anotherFile.txt");
        try (Scanner sc = new Scanner(file)) {
            String message = sc.nextLine();
            System.out.println("read from file " + message);
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }
    }
}
