package com.acezk.oa.jxl;

import java.io.*;

import jxl.Workbook;
import jxl.format.UnderlineStyle;
import jxl.write.*;

public class JXLTest {
	
	public static void main(String[] args) {
		OutputStream output = null;
		try {
			output = new FileOutputStream(new File("C:\\Users\\acezk\\Documents\\测试.xls"));
			//打开文件
			WritableWorkbook wwb = Workbook.createWorkbook(output);
			//生成名为“第一页”的工作表，参数0表示这是第一页
			WritableSheet ws1 = wwb.createSheet("第一页", 0);
			//设置单元格默认宽度
			ws1.getSettings().setDefaultColumnWidth(30);
			//定义格式
			WritableFont wf_title = new WritableFont(WritableFont.ARIAL, 11, WritableFont.NO_BOLD, false, UnderlineStyle.NO_UNDERLINE, jxl.format.Colour.BLACK);
			//单元格定义  
			WritableCellFormat wcf_title = new WritableCellFormat(wf_title); 
            wcf_title.setBackground(jxl.format.Colour.WHITE); // 设置单元格的背景颜色  
            wcf_title.setAlignment(jxl.format.Alignment.CENTRE); // 设置对齐方式  
            wcf_title.setBorder(jxl.format.Border.ALL, jxl.format.BorderLineStyle.THIN,jxl.format.Colour.BLACK); //设置边框
            //写入单元格
            ws1.addCell(new Label(0, 0, "统计", wcf_title));
            ws1.addCell(new Label(0, 1, "统计1", wcf_title));
            ws1.addCell(new Label(1, 1, "统计2", wcf_title));
            //单元格合并
            ws1.mergeCells(0, 0, 1, 0);
            wwb.write();
			wwb.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
