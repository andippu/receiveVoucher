package com.rv.receivevoucher.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rv.receivevoucher.models.ReportFakturCash;
import com.rv.receivevoucher.reports.ServiceReportRekapCustFaktNew3;
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
class ControllerReports {
	@Autowired
    private ServiceReportRekapCustFaktNew3 servRRCFN3;
	
	 @GetMapping("/pdf/reportrekapcustfaktnew3")
	 public void createPDF(String period, String cuscode, HttpServletResponse response) throws IOException, JRException {
	       response.setContentType("application/pdf");
	       DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
	       String currentDateTime = dateFormatter.format(new Date());
	       String headerKey = "Content-Disposition";
	       String headerValue = "attachment; filename=Rekap_Cust_Fak_new3" + currentDateTime + ".pdf";
	       response.setHeader(headerKey, headerValue);
	       servRRCFN3.tJaRepReportRekapCustFaktNew3(period, cuscode, response);
	    }

}
