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
	
	//@GetMapping("/report/getfaktcashlist")
	//public List<ReportFakturCash> getFakturCashList(String pdate, String pcusno, String pfm_awl, String pfm_akh, String pstatus, String ttd){
	//	return 
	//};
	
	
	 @GetMapping("/pdf/reportfakturcash")
	 public void createPDF(String pdate, String pcusno, String pfm_awl, String pfm_akh, String pstatus, String ttd,HttpServletResponse response) throws IOException, JRException {
		 servRFc.getFakturCashList(pdate, pcusno, pfm_awl, pfm_akh, pstatus,  ttd);
		   response.setContentType("application/pdf");
	       DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
	       String currentDateTime = dateFormatter.format(new Date());
	       String headerKey = "Content-Disposition";
	       String headerValue = "attachment; filename=Faktur_Cash_" + currentDateTime + ".pdf";
	       response.setHeader(headerKey, headerValue);
	       servReport.exportJasperReport(pdate,  pcusno,  pfm_awl,  pfm_akh,  pstatus, ttd, response);
	    }
}
