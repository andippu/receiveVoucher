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
	
	public void exportJasperReport(String pdate, String ttd,HttpServletResponse response) throws JRException, IOException {
		   System.out.println("5555");
        List<ReportFakturCash> address = repoRFc.findByRfcsDate(pdate);
        //Get file and compile it
        System.out.println("666");
        File file = ResourceUtils.getFile("classpath:test213.jrxml");
        System.out.println("7777");
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        System.out.println("88888");
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(address);
        System.out.println("9999");
        Map<String, Object> parameters = new HashMap<>();
        System.out.println("aaaa");
        parameters.put("tandatangan", ttd);
        System.out.println("bbbb");
        //Fill Jasper report
        System.out.println("cccc");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
        //Export report
        System.out.println("dddd");
        JasperExportManager.exportReportToPdfStream(jasperPrint,response.getOutputStream());
    }

}
