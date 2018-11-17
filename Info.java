import java.io.OutputStream;
import java.util.List;
 
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Info{
//����HSSFWorkbook����(excel���ĵ�����)
      HSSFWorkbook wb = new HSSFWorkbook();
//�����µ�sheet����excel�ı���
HSSFSheet sheet=wb.createSheet("ͬѧ��");
//��sheet�ﴴ����һ�У�����Ϊ������(excel����)��������0��65535֮����κ�һ��
HSSFRow row1=sheet.createRow(0);
//������Ԫ��excel�ĵ�Ԫ�񣬲���Ϊ��������������0��255֮����κ�һ��
HSSFCell cell=row1.createCell(0);
//��sheet�ﴴ���ڶ���
HSSFRow row2=sheet.createRow(1);    
      //������Ԫ�����õ�Ԫ������
      row2.createCell(0).setCellValue("����");
      row2.createCell(1).setCellValue("��ַ");    
      row2.createCell(2).setCellValue("�绰");
      row2.createCell(3).setCellValue("΢��");
      row2.createCell(4).setCellValue("����");
      row2.createCell(5).setCellValue("QQ");
      row2.createCell(6).setCellValue("��������");
      
      //��sheet�ﴴ��������
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
    //���Excel�ļ�
      OutputStream output=response.getOutputStream();
      response.reset();
      response.setHeader("Content-disposition", "attachment; filename=details.xls");
      response.setContentType("application/msexcel");        
      wkb.write(output);
      output.close();
  return null;
}