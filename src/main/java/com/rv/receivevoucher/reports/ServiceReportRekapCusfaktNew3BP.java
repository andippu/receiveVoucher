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

import com.rv.receivevoucher.models.ReportRekapCusfaktNew3BP;
import com.rv.receivevoucher.models.ReportRekapCusfaktNew3OC;
import com.rv.receivevoucher.repository.IReportRekapCusfaktNew3BP;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Service
public class ServiceReportRekapCusfaktNew3BP {
	@Autowired
	IReportRekapCusfaktNew3BP repoRCFN3BP;
	
	
public void tJaReportRekapCusfaktNew3BP(String period, String cuscode, HttpServletResponse response) throws JRException, IOException {
		   System.out.println("5555");
  List<ReportRekapCusfaktNew3BP> VRRCFN3BP= repoRCFN3BP.findByRrcfPeriodAndRrcfCusCodeContaining(period,cuscode);

  File file = ResourceUtils.getFile("classpath:Rekap_Cust_Fakt_New3.jrxml");
 
  JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());

  JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(VRRCFN3BP);

  Map<String, Object> parameters = new HashMap<>();
 
  parameters.put("Period", period);
  parameters.put("custcode", cuscode);

  //Fill Jasper report
  
  JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
  //Export report

  JasperExportManager.exportReportToPdfStream(jasperPrint,response.getOutputStream());
}
}
