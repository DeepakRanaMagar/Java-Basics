import java.io.*;
class ToWrite{
    public static void main(String[] args)throws IOException {
        File file = new File("Text.txt");
        FileOutputStream f = new FileOutputStream(file);
        f.write(355);
        f.close();
    }
}