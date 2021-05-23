import java.io.File;
import java.io.IOException;

public class OperateFile {

    public OperateFile() {
    }

    public void operate(File destFile) throws IOException{
        File tmpFile = new File("abc.tmp");
        if (!destFile.delete()) {
            throw new IOException("fail delete");
        }
        if (!tmpFile.renameTo(destFile))  {
            throw new IOException("fail renameTo");
        }
    }

    public void operateFail(File destFile) throws IOException{
        File tmpFile = new File("abc.tmp");
        throw new IOException("operateFail");
    }
}
