package ToRead;

import java.io.*;

class ToRead {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream f = new FileInputStream("test.txt");
            while((i=f.read())!=-1){
                System.out.println((char)i);
            }
            f.close();

    }
}