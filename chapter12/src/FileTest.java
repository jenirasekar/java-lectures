import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("F:\\tugas kuliah\\sem2\\java-lectures\\chapter12\\src\\FileTest.java");

        System.out.println("Does it exist? " + file.exists());
        System.out.println("Is it a directory? " + file.isDirectory());
        System.out.println("Is it a file? " + file.isFile());

        File dir = new File("E:\\hello_file");
        System.out.println("Does hello_file exist? " + dir.exists());
        if (!dir.exists()) {
            dir.mkdir();
        }
    }
}
