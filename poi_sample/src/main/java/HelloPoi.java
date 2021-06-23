import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.WorkbookUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class HelloPoi {
    public static void main(String[] args) throws IOException {
        Workbook wb = new XSSFWorkbook();

        String sheetName = WorkbookUtil.createSafeSheetName("新しいシート");
        Sheet sheet1 = wb.createSheet(sheetName);

        OutputStream fileOut = new FileOutputStream("sample.xlsx");

        wb.write(fileOut);

    }
}
