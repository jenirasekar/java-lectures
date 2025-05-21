import java.io.*;

public class TestDataStream {
    public static void main(String[] args) {
        try (DataOutputStream dout = new DataOutputStream(new FileOutputStream("dout.dat"))){
            dout.writeUTF("Je");
            dout.writeDouble(99);

            dout.writeUTF("Sekar");
            dout.writeDouble(100);
        } catch (IOException e) {
            System.out.println("error while writing dout.dat");
        }

        try (DataInputStream din = new DataInputStream(new FileInputStream("dout.dat"))){
            System.out.println(din.readUTF() + " " + din.readDouble());
            System.out.println(din.readUTF() + " " + din.readDouble());
        } catch (IOException e) {
            System.out.println("error while reading dout.dat");
        }
    }
}
