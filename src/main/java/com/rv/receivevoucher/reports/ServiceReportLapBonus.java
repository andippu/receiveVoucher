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

import com.rv.receivevoucher.models.ReportLapBonus;
import com.rv.receivevoucher.repository.IReportLapBonus;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Service
public class ServiceReportLapBonus {
	@Autowired
	IReportLapBonus repoLBonus;
	
	public List<ReportLapBonus> getallList(){
		return repoLBonus.findAll();
	}
	
	public void tJaReportLapBonus(String pbulan, HttpServletResponse response) throws JRException, IOException {

			List<ReportLapBonus> bonus= repoLBonus.findByRlboPeriod(pbulan);	
			File file = ResourceUtils.getFile("classpath:Laporan_Bonus.jrxml");	
			JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());	
			JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(bonus);	
			Map<String, Object> parameters = new HashMap<>();	
			parameters.put("pbulan", pbulan);	
			//Fill Jasper report	
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
			//Export report	
			JasperExportManager.exportReportToPdfStream(jasperPrint,response.getOutputStream());
			}

}
