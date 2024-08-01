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

import com.rv.receivevoucher.models.ReportRekapCusfaktNew3OC;
import com.rv.receivevoucher.models.ReportRekapCustFaktNew3;
import com.rv.receivevoucher.repository.IReportRekapCusfaktNew3OC;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;


@Service
public class ServiceReportRekapCusfaktNew3OC {
	@Autowired
	IReportRekapCusfaktNew3OC repoRCFN3OC;
	
	public void tJaReportRekapCusfaktNew3OC(String period, String cuscode, HttpServletResponse response) throws JRException, IOException {
		   System.out.println("5555");
  List<ReportRekapCusfaktNew3OC> VRRCFN3= repoRCFN3OC.findByRrcfPeriodAndRrcfCusCodeContaining(period,cuscode);
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
