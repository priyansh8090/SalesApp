package BaseSales;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelutils extends BaseSales {
	
	 public static List<List<String>> readExcelData(String filePath) {
	        List<List<String>> data = new ArrayList<>();

	        try (FileInputStream fis = new FileInputStream(new String(filePath));
	             Workbook workbook = WorkbookFactory.create(fis)) {

	            Sheet sheet = workbook.getSheetAt(0); // Get the first sheet
	            for (Row row : sheet) {
	                List<String> rowData = new ArrayList<>();
	                row.forEach(cell -> rowData.add(cell.toString()));
	                data.add(rowData);
	            }

	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        return data;
	    }
	}
	
	
	


