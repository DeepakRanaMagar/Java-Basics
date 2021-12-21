import java.io.*;
class ToReadString{
    public static void main(String[] args)throws IOException {
        File file = new File("text.txt");
        FileOutputStream f = new FileOutputStream(file);
        String s = "HELLO WORLD";
        byte[] byteMsg = s.getBytes();
        f.write(byteMsg);
        f.close();
    }
}