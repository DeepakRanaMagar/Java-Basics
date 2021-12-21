import java.io.*;
import java.util.zip.*;

public class ZipQuestion {
    static public void createZip(File path) throws IOException,ClassNotFoundException {
        File[] files = path.listFiles();
        if (files.length == 0) {
            throw new IllegalArgumentException();
        }
        FileOutputStream fos = new FileOutputStream("myzip.zip");
        ZipOutputStream zos = new ZipOutputStream(fos);
        for (File f : files) {
            FileInputStream fis = new FileInputStream(f);
            ZipEntry ze = new ZipEntry(f.getName());
            zos.putNextEntry(ze);
            int content;
            while ((content = fis.read()) != -1) {
                zos.write(content);
            }
            fis.close();
        }
        zos.close();
        fos.close();
    }

    public static void main(String[] args) throws IOException,ClassNotFoundException {
        createZip(new File("Test"));
    }
}
