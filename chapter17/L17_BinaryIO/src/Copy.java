import java.io.*;

public class Copy {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please input source and target");
            System.exit(1);
        }
        String source = args[0];
        String target = args[1];
        System.out.println("Source: " + source);
        System.out.println("Target: " + target);

        // check if file doesn't exist
        File sourceFile = new File(source);
        if (!sourceFile.exists()) {
            System.out.println("Error:　source file doesn't exist");
            System.exit(1);
        }

        // check if file exists
        File targetFile = new File(target);
        if (targetFile.exists()) {
            System.out.println("Error: file already exists");
            System.exit(1);
        }

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(targetFile));)
        {
            int value = bis.read();
            int bytesRead = 0;
            while (value != -1) {
                bos.write(value);
                bytesRead++;
                value = bis.read();
            }
            System.out.println("bytes copied: " + bytesRead);
        } catch (IOException e) {

        }
    }

}
