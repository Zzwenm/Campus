package com.example.taoxiao;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class excel {
	public static void set(List<user> luser) throws IOException {
		HSSFWorkbook workBook = new HSSFWorkbook();
		HSSFSheet sheet = workBook.createSheet();
		//Sheet sheet1 = workBook.createSheet("new sheet");
		int n=luser.size();
		HSSFRow row;
		row = sheet.createRow(0);
		row.createCell(0).setCellValue("姓名");
		row.createCell(1).setCellValue("家庭住址");
		row.createCell(2).setCellValue("电话");
		row.createCell(3).setCellValue("微信");
		row.createCell(4).setCellValue("邮箱");
		row.createCell(5).setCellValue("QQ");
		row.createCell(6).setCellValue("个性语言");
		for(int i=1;i<n;i++) {
			row = sheet.createRow(i);
			for(int j=0;j<7;j++) {
				//HSSFCell cell = row.createCell(i);
			    //cell.setCellValue(1);
				switch(j) {
				case 0:
					row.createCell(j).setCellValue(luser.get(i).getName());break;
				case 1:
					row.createCell(j).setCellValue(luser.get(i).getAddress());break;
				case 2:
					row.createCell(j).setCellValue(luser.get(i).getPhonenumber());break;
				case 3:
					row.createCell(j).setCellValue(luser.get(i).getWechat());break;
				case 4:
					row.createCell(j).setCellValue(luser.get(i).getEmail());break;
				case 5:
					row.createCell(j).setCellValue(luser.get(i).getQq());break;
				case 6:
					row.createCell(j).setCellValue(luser.get(i).getWord());break;
				}
			}
		}
		try (OutputStream fileOut = new FileOutputStream("workbook.xls")) {
	        workBook.write(fileOut);
	        fileOut.close();
	    }
		
	}
}
