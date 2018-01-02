package Component;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;

public class Excel {
	
	private Excel() {
		
	}
	
	public static Excel getExcelObeject() {
		return new Excel();
	} 
	
	public static ArrayList<ArrayList<String>> readExcel()  {
		ArrayList<ArrayList<String>> tableDataArrayList=new ArrayList<>();
		ArrayList<String> rowDataArrayList;	
        FileInputStream fileInputStream=null ;
        POIFSFileSystem poifsFileSystem=null ;
        HSSFWorkbook hssfWorkbook=null ;
        String filePath = "excel/write.xls";
        if(!Files.notExists(Paths.get(filePath))) {
	        try
	        {
				fileInputStream = new FileInputStream(filePath);
				poifsFileSystem = new POIFSFileSystem( fileInputStream);
				hssfWorkbook = new HSSFWorkbook(poifsFileSystem);
				HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(0); 
	
				Iterator<Row> rowIterator=hssfSheet.iterator();
				
				while(rowIterator.hasNext()) {
					rowDataArrayList=new ArrayList<>();
					Row currentRow=rowIterator.next();
					Iterator<Cell> cellIterator=currentRow.iterator();
					while(cellIterator.hasNext()) {
						Cell currentCell=cellIterator.next();
						if(currentCell.getCellTypeEnum() !=CellType.BLANK)
							rowDataArrayList.add(currentCell.toString());
					}
					tableDataArrayList.add(rowDataArrayList);
				}
				fileInputStream.close();
	        }catch(java.io.IOException e)
	        {
	          e.printStackTrace();
	        }
	        if(tableDataArrayList.size()!=0)
	        	tableDataArrayList.remove(0);
			return tableDataArrayList;
        }
        return null;
	}
	
	public void writeExcel(ArrayList<ArrayList<String>> tableDataArrayList) {
		FileOutputStream fileOutputStream =null;
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook() ;
        String filePath = "excel/write.xls";
        HSSFSheet hssfSheet=hssfWorkbook.createSheet(TextContent.leave);
        Object[] columnNames=TextContent.columnNames;
        
        int rowNum=0;
        Row row=hssfSheet.createRow(rowNum++);
        int columnNum=0;
        for(Object leaveColumn:columnNames) {
        	Cell cell=row.createCell(columnNum++);
    		if(leaveColumn instanceof String)
    			cell.setCellValue((String) leaveColumn);
        }
        
        for(ArrayList<String> rowDataArrayList:tableDataArrayList) {
        	row=hssfSheet.createRow(rowNum++);
        	columnNum=0;
        	for(String leaveCell:rowDataArrayList) {
        		Cell cell=row.createCell(columnNum++);
        		if(leaveCell instanceof String)
        			cell.setCellValue((String) leaveCell);
        	}
        }
        try {
        	fileOutputStream=new FileOutputStream(filePath);
        	hssfWorkbook.write(fileOutputStream);
        	hssfWorkbook.close();
        } catch (FileNotFoundException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
