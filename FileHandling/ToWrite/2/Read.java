import java.io.*;
public class Read {
    public static void main(String[] args)throws IOException {
        int i; 
        FileInputStream f = new FileInputStream("text.txt");
        while((i=f.read())!=-1){
            System.out.println((char)i);
        }f.close();
    }
}
