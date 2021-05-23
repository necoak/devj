import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;

public class Main {
    public static void main(String[] args) {

        File xyzFile = new File("wk/xyz");
        byte[] xyzContent;
        try {
            xyzContent = Files.readAllBytes(xyzFile.toPath());
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        System.out.println("cp wk/xyz -> wk/xyz.tmp");
        File tmpFile1 = new File("wk/xyz.tmp");
        try (FileOutputStream outStream = new FileOutputStream(tmpFile1)) {
            outStream.write(xyzContent);
            new IOException();

        } catch (IOException e) {

        }

        System.out.println("mv wk/xyz.tmp -> wk/xyz.renamed");
        File tmpFile2 = new File("wk/xyz.tmp");
        File renameToFile = new File("wk/xyz.renamed");
        try (FileOutputStream outStream = new FileOutputStream(tmpFile2);) {
            outStream.write(xyzContent);
            if(renameToFile.exists() && !renameToFile.delete()) {
                System.out.println("delete failed");
            }
            if(!tmpFile2.renameTo(renameToFile)) {
                throw new IOException("tmpFile.renameTo(classFile) failed");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
