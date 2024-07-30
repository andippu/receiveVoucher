package com.rv.receivevoucher.reports;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import com.rv.receivevoucher.models.ReportFakturCash;
import com.rv.receivevoucher.models.ReportRekapCustFaktNew3;
import com.rv.receivevoucher.repository.IReportRekapCustFaktNew3;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;


@Service
public class ServiceReportRekapCustFaktNew3 {
	@Autowired
	IReportRekapCustFaktNew3 repoRRCFN3;
	
	public void tJaRepReportRekapCustFaktNew3(String period, String cuscode, HttpServletResponse response) throws JRException, IOException {
		   System.out.println("5555");
     List<ReportRekapCustFaktNew3> VRRCFN3= repoRRCFN3.findByRrcfPeriodAndRrcfCusCodeContaining(period,cuscode);
     //Get file and compile it
     System.out.println("666");
     File file = ResourceUtils.getFile("classpath:Rekap_Cust_Fakt_New3.jrxml");
     System.out.println("7777");
     JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
     System.out.println("88888");
     JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(VRRCFN3);
     System.out.println("9999");
     Map<String, Object> parameters = new HashMap<>();
     System.out.println("aaaa");
     parameters.put("Period", period);
     parameters.put("custcode", cuscode);
     System.out.println("bbbb");
     //Fill Jasper report
     System.out.println("cccc");
     JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
     //Export report
     System.out.println("dddd");
     JasperExportManager.exportReportToPdfStream(jasperPrint,response.getOutputStream());
 }
}
