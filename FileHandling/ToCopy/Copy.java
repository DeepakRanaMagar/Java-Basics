import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class Copy{
    public static void main(String[] args)throws IOException {
        FileInputStream in  = new FileInputStream("text.txt");
        FileOutputStream out = new FileOutputStream("DupsText.txt");

        int a;
        while((a=in.read())!=-1){
            out.write(a);
        }
        in.close();
        out.close();
    }
}