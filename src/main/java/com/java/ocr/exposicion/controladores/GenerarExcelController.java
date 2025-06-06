package com.java.ocr.exposicion.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

@RestController
public class GenerarExcelController {
	
	@GetMapping("/generarExcel")
	public String generarExcel() {
		
		
		 Workbook workbook = new XSSFWorkbook();
	        Sheet sheet = workbook.createSheet("Example");

	        Row row = sheet.createRow(0);
	        Cell cell = row.createCell(0);
	        cell.setCellValue("Hello, Java 7!");

	        try (FileOutputStream outputStream = new FileOutputStream("D:\\test\\example.xlsx")) {
	            workbook.write(outputStream);
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                workbook.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
		
		return "";
		
	}

}
