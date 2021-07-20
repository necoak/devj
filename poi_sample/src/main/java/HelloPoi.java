import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellReference;
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

        CellReference cr = new CellReference("A1");

        //sheet1.createRow(0);
        //sheet1.getRow(0).createCell(0);

        //Cell cell = sheet1.getRow(cr.getRow()).getCell(cr.getCol());
        //cell.setCellValue(1234);

        for (int i = 0; i < 10; i++) {
            Row row = sheet1.getRow(i);
            if (row == null)
                row = sheet1.createRow(i);
            for (int j = 0; j < 10; j++) {
                Cell cell = row.getCell(j);
                if (cell == null)
                    cell = row.createCell(j);
                cell.setCellValue(String.format("[%s,%s]",i,j));
            }
        }


        OutputStream fileOut = new FileOutputStream("sample.xlsx");

        wb.write(fileOut);

    }
}
