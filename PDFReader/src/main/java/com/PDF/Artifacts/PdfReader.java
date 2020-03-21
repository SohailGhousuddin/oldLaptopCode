package com.PDF.Artifacts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.io.RandomAccessRead;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.text.PDFTextStripper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimplePdfExporterConfiguration;
import net.sf.jasperreports.export.SimplePdfReportConfiguration;

@Service
public class PdfReader {

	public PdfReader()
	{}
	
	public void ReadJasperReport()
	{
		/*
		InputStream employeeReportStream
		  = getClass().getResourceAsStream("/employeeReport.jrxml");
		try {
			JasperReport jasperReport
			  = JasperCompileManager.compileReport(employeeReportStream);
			Map<String, Object> parameters = new HashMap<>();
			parameters.put("title", "Employee Report");
			parameters.put("minSalary", 15000.0);
			parameters.put("condition", " LAST_NAME ='Smith' ORDER BY FIRST_NAME");
			 
		

				JRBeanCollectionDataSource studentDS = new JRBeanCollectionDataSource(studentCollection);
				JasperFillManager.fillReport(jasperReport, parameters, studentDS);
			
			
			JRPdfExporter exporter = new JRPdfExporter();
			 exporter.setParameters(parameters);
			exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
			exporter.setExporterOutput(
			  new SimpleOutputStreamExporterOutput("employeeReport.pdf"));
			 
			SimplePdfReportConfiguration reportConfig
			  = new SimplePdfReportConfiguration();
			reportConfig.setSizePageToContent(true);
			reportConfig.setForceLineBreakPolicy(false);
			 
			SimplePdfExporterConfiguration exportConfig
			  = new SimplePdfExporterConfiguration();
			exportConfig.setMetadataAuthor("baeldung");
			exportConfig.setEncrypted(true);
			exportConfig.setAllowedPermissionsHint("PRINTING");
			 
			exporter.setConfiguration(reportConfig);
			exporter.setConfiguration(exportConfig);
			 
			exporter.exportReport();

		} catch (JRException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

	public String ReadPdf(String aFileName)
	{
		
		String retValue = null;
		
	        PDDocument pdDoc = null;
	        COSDocument cosDoc = null;
	        File file = new File("D:\\PdfReader\\"+aFileName+".pdf");//C:/my.pdf");
	        
 
	        
	        
	    	PDDocument doc = null;
			try {
				doc = PDDocument.load(file);
				   //Instantiate PDFTextStripper class
		        PDFTextStripper pdfStripper = new PDFTextStripper();
				retValue = pdfStripper.getText(doc);
				doc.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return retValue;
	        
	    }

	public void writePdf(String aFileName, int aPosx,int aPosy)
	{
		
	
 }
}
