import java.io.*;
class Write{
        public static void main(String[] args)throws IOException {
            File file = new File("text.txt");
            FileOutputStream f = new FileOutputStream(file);
            f.write(50);
            f.close();
        }
}