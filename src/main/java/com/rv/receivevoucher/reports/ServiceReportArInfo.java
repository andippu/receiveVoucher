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

import com.rv.receivevoucher.models.ReportArInfo;
import com.rv.receivevoucher.models.ReportLapBonus;
import com.rv.receivevoucher.repository.IReportArInfo;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Service

public class ServiceReportArInfo {
	@Autowired
	IReportArInfo repoArInfo;
	
	public void tJaReportLapArInfo(String fmno, HttpServletResponse response) throws JRException, IOException {

		List<ReportArInfo> arinfo= repoArInfo.findByRarinFmNo(fmno);	
		File file = ResourceUtils.getFile("classpath:Laporan_Ar_Info.jrxml");	
		JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());	
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(arinfo);	
		Map<String, Object> parameters = new HashMap<>();	
		//Fill Jasper report	
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
		//Export report	
		JasperExportManager.exportReportToPdfStream(jasperPrint,response.getOutputStream());
		}

}
