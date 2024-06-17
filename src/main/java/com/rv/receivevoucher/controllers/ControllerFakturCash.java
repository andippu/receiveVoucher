package com.rv.receivevoucher.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rv.receivevoucher.models.ReportFakturCash;
import com.rv.receivevoucher.reports.ServiceRptFakturCash;
import com.rv.receivevoucher.services.ServiceFakturCash;

import net.sf.jasperreports.engine.JRException;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JRException;

@RestController
public class ControllerFakturCash {
	@Autowired
	ServiceFakturCash servRFc;
	@Autowired
    private ServiceRptFakturCash servReport;
	
	@GetMapping("/report/getfaktcashlist")
	public List<ReportFakturCash> getFakturCashList(String pdate, String ttd){
		return servRFc.getFakturCashList(pdate, ttd);
	};
	
	 @GetMapping("/pdf/reportfakturcash")
	 public void createPDF(String pdate, String ttd,HttpServletResponse response) throws IOException, JRException {
		   System.out.println("1111111");
	       response.setContentType("application/pdf");
	       DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
	       String currentDateTime = dateFormatter.format(new Date());
	       System.out.println("22222");
	       String headerKey = "Content-Disposition";
	       String headerValue = "attachment; filename=Faktur_Cash_" + currentDateTime + ".pdf";
	       response.setHeader(headerKey, headerValue);
	       System.out.println("333");
	       servReport.exportJasperReport(pdate, ttd, response);
	       System.out.println("44444");
	    }
}
