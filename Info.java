import java.io.OutputStream;
import java.util.List;
 
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Info{
//创建HSSFWorkbook对象(excel的文档对象)
      HSSFWorkbook wb = new HSSFWorkbook();
//建立新的sheet对象（excel的表单）
HSSFSheet sheet=wb.createSheet("同学表");
//在sheet里创建第一行，参数为行索引(excel的行)，可以是0～65535之间的任何一个
HSSFRow row1=sheet.createRow(0);
//创建单元格（excel的单元格，参数为列索引，可以是0～255之间的任何一个
HSSFCell cell=row1.createCell(0);
//在sheet里创建第二行
HSSFRow row2=sheet.createRow(1);    
      //创建单元格并设置单元格内容
      row2.createCell(0).setCellValue("姓名");
      row2.createCell(1).setCellValue("地址");    
      row2.createCell(2).setCellValue("电话");
      row2.createCell(3).setCellValue("微信");
      row2.createCell(4).setCellValue("邮箱");
      row2.createCell(5).setCellValue("QQ");
      row2.createCell(6).setCellValue("个性语言");
      
      //在sheet里创建第三行
      int n=list<user>.size()
      HSSFRow row[]=new HSSFRow[n]; 
      for(int i=0;i<n;i++)
      {
      HSSFRow row[i]=sheet.createRow(i+2);
      user Userepm=List<user>.get(i)
      row[i].createCell(0).setCellValue(Userepm.getName());
      row[i].createCell(1).setCellValue(Userepm.getAddress());
      row[i].createCell(2).setCellValue(Userepm.getPhonenumber());    
      row[i].createCell(3).setCellValue(Userepm.getWechat());    
      row[i].createCell(4).setCellValue(Userepm.getEmail);    
      row[i].createCell(5).setCellValue(Userepm.getQq);
      row[i].createCell(6).setCellValue(Userepm.getWord);    
      }
    //输出Excel文件
      OutputStream output=response.getOutputStream();
      response.reset();
      response.setHeader("Content-disposition", "attachment; filename=details.xls");
      response.setContentType("application/msexcel");        
      wkb.write(output);
      output.close();
  return null;
}