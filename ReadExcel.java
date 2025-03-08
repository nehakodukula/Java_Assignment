import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcel {
    public static void main(String[] args) {
        String filePath = "data.xlsx"; // Change to your file path
        
        try (FileInputStream fis = new FileInputStream(new File(filePath));
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0); // Read first sheet
            for (Row row : sheet) {
                for (Cell cell : row) {
                    System.out.print(cell + "\t");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}