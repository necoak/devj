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

        System.out.println("mv wk/xyz1.tmp -> wk/xyz1.renamed");
        File tmpFile1 = new File("wk/xyz.tmp");
        File renameToFile1 = new File("wk/xyz1.renamed");
        try (FileOutputStream outStream = new FileOutputStream(tmpFile1);) {
            outStream.write(xyzContent);
            if(renameToFile1.exists() && !renameToFile1.delete()) {
                System.out.println("delete failed");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(!tmpFile1.renameTo(renameToFile1)) {
            try {
                throw new IOException("[tmpFile1] tmpFile.renameTo(classFile) failed");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



        System.out.println("cp wk/xyz -> wk/xyz2.tmp");
        File tmpFile2_1 = new File("wk/xyz.tmp");
        try (FileOutputStream outStream = new FileOutputStream(tmpFile2_1)) {
            outStream.write(xyzContent);
            new IOException();

        } catch (IOException e) {

        }

        System.out.println("mv wk/xyz2.tmp -> wk/xyz2.renamed");
        File tmpFile2_2 = new File("wk/xyz.tmp");
        File renameToFile2_2 = new File("wk/xyz2.renamed");
        try (FileOutputStream outStream = new FileOutputStream(tmpFile2_2);) {
            outStream.write(xyzContent);
            if(renameToFile2_2.exists() && !renameToFile2_2.delete()) {
                System.out.println("delete failed");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(!tmpFile2_2.renameTo(renameToFile2_2)) {
            try {
                throw new IOException("[tmpFile2_2] tmpFile.renameTo(classFile) failed");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
