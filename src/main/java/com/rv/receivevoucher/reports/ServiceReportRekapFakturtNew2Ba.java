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

import com.rv.receivevoucher.models.ReportRekapFakturNew2;
import com.rv.receivevoucher.models.ReportRekapFakturtNew2Ba;
import com.rv.receivevoucher.repository.IReportRekapFakturtNew2Ba;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Service
public class ServiceReportRekapFakturtNew2Ba {
	@Autowired
	IReportRekapFakturtNew2Ba repoRRFNBA;
	
	public void ReportRekapFaktNew2(String period,  HttpServletResponse response) throws JRException, IOException {

		List<ReportRekapFakturtNew2Ba> RRFNBA= repoRRFNBA.findByRrfnbaPeriod(period);

		File file = ResourceUtils.getFile("classpath:Rekap_Fakturt_New2_Ba.jrxml");

		JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
	
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(RRFNBA);

		Map<String, Object> parameters = new HashMap<>();

		parameters.put("Period", period);

		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);

		JasperExportManager.exportReportToPdfStream(jasperPrint,response.getOutputStream());
	}
}
