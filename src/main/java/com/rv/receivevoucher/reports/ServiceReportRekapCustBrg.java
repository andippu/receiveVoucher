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

import com.rv.receivevoucher.models.ReportRekapCustBrg;
import com.rv.receivevoucher.models.ReportRekapCustFaktNew3;
import com.rv.receivevoucher.repository.IReportRekapCustBrg;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;


@Service
public class ServiceReportRekapCustBrg {
	@Autowired
	IReportRekapCustBrg repoRRCB;
	
	public void tJaRepReportRekapCustBrg(String period, String cuscode, HttpServletResponse response) throws JRException, IOException {
		  repoRRCB.runBefReCustBrg(period);
		  List<ReportRekapCustBrg> RRCB= repoRRCB.findByRrcbPeriodeAndRfcbCusCodeContaining(period,cuscode);
		  File file = ResourceUtils.getFile("classpath:Rekap_Faktur_Cust_Brg.jrxml");
		  JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
		  JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(RRCB);
		  Map<String, Object> parameters = new HashMap<>();
		  parameters.put("Period", period);
		  parameters.put("custcode", cuscode);
		  JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
		  //Export report
		  JasperExportManager.exportReportToPdfStream(jasperPrint,response.getOutputStream());
		}
	

}
