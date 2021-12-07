import java.io.*;

class ByteMsg {
    public static void main(String[] args) throws IOException {
        File file = new File("text.txt");
        FileOutputStream f = new FileOutputStream(file);
        String msg = "Hello World";
        byte[] byteMsg = msg.getBytes();
        f.write(byteMsg);
        f.close();

    }
}