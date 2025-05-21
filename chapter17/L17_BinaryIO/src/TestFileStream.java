import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileStream {
    public static void main(String[] args) {
        try (FileOutputStream fout = new FileOutputStream("temp.data")) {
            for (int i = 1; i <= 10; i++) {
                fout.write(i);
            }
        } catch (IOException e) {
            System.out.println("We have an error while writing temp.data");
        }

        try (FileInputStream fin = new FileInputStream("temp.data")) {
            int value;
            while ((value = fin.read()) != -1) {
                System.out.println(value + " ");
            }
        } catch (IOException e) {
            System.out.println("We have an error while reading temp.data");
        }
    }
}
