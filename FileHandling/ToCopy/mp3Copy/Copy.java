import java.io.*;
class Copy{
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("Aries.mp3");
        FileOutputStream fos = new FileOutputStream("DupsAries.mp3");

        //Buffered function
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        int a;
        while((a=bis.read())!=-1){
            bos.write(a);
        }
        fis.close();
        fos.close();
        bis.close();
        bos.close();
    }
}