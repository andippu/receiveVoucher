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
import com.rv.receivevoucher.repository.IReportFakturCashRepository;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;


@Service
public class ServiceRptFakturCash {
	@Autowired
	IReportFakturCashRepository repoRFc;
	
	public void exportJasperReport(String pdate, String pcusno, String pfm_awl, String pfm_akh, String pstatus, String ttd,HttpServletResponse response) throws JRException, IOException {
		   String temp = repoRFc.getFakturCash(pdate, pcusno, pfm_awl, pfm_akh, pstatus);
		
        List<ReportFakturCash> fkt = repoRFc.findAll();        //Get file and compile it  
        System.out.println("aaaaa :"+pdate+" - "+ pcusno+" - "+ pfm_awl+" - "+ pfm_akh+" - "+ pstatus+" - "+temp+" - "+fkt.size());
        File file = ResourceUtils.getFile("classpath:LAP_FAKTUR_MASTRE.jrxml");     
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());       
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(fkt);       
        Map<String, Object> parameters = new HashMap<>();     
        parameters.put("ttd", ttd);     
        //Fill Jasper report
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
        //Export report
        JasperExportManager.exportReportToPdfStream(jasperPrint,response.getOutputStream());
    }

}
