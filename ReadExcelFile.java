import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcelFile {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream(new File("data.xlsx"));
             Workbook workbook = new XSSFWorkbook(fis)) {
             
            Sheet sheet = workbook.getSheetAt(0);
            for (Row row : sheet) {
                for (Cell cell : row) {
                    System.out.print(cell.toString() + "\t");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}