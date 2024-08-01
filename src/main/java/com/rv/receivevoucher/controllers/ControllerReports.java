package com.rv.receivevoucher.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rv.receivevoucher.models.ReportFakturCash;
import com.rv.receivevoucher.reports.ServiceReportRekapCusfaktNew3BP;
import com.rv.receivevoucher.reports.ServiceReportRekapCusfaktNew3OC;
import com.rv.receivevoucher.reports.ServiceReportRekapCustFaktNew3;
import com.rv.receivevoucher.reports.ServiceReportRekapFakturNew2;
import com.rv.receivevoucher.reports.ServiceReportRekapFakturtNew5;
import com.rv.receivevoucher.reports.ServiceRptFakturCash;
import com.rv.receivevoucher.repository.IReportRekapFakturtNew5;
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
	@Autowired
	private ServiceReportRekapFakturtNew5 servRRFN5;
	@Autowired
	private ServiceReportRekapFakturNew2 servRRFN2;	
	@Autowired
	private ServiceReportRekapCusfaktNew3OC servRRCFN3OC;	
	@Autowired
	private ServiceReportRekapCusfaktNew3BP servRRCFN3BP;
	
	
	 @GetMapping("/pdf/reportrekapcustfaktnew3")
	 public void createPDF(String period, String cuscode, HttpServletResponse response) throws IOException, JRException {
	       response.setContentType("application/pdf");
	       DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
	       String currentDateTime = dateFormatter.format(new Date());
	       String headerKey = "Content-Disposition";
	       String headerValue = "attachment; filename=Rekapitulasi By Customer " + currentDateTime + ".pdf";
	       response.setHeader(headerKey, headerValue);
	       servRRCFN3.tJaRepReportRekapCustFaktNew3(period, cuscode, response);
	     //  return "Report Has bee Download";
	    }
	 
	 @GetMapping("/pdf/reportrekapcustfaktnew3OC")
	 public void createPDFOC(String period, String cuscode, HttpServletResponse response) throws IOException, JRException {
	       response.setContentType("application/pdf");
	       DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
	       String currentDateTime = dateFormatter.format(new Date());
	       String headerKey = "Content-Disposition";
	       String headerValue = "attachment; filename=Rekapitulasi By Customer OTC " + currentDateTime + ".pdf";
	       response.setHeader(headerKey, headerValue);
	       servRRCFN3OC.tJaReportRekapCusfaktNew3OC(period, cuscode, response);
	     //  return "Report Has bee Download";
	    }
	 
	 @GetMapping("/pdf/reportrekapcustfaktnew3BP")
	 public void createPDFBP(String period, String cuscode, HttpServletResponse response) throws IOException, JRException {
	       response.setContentType("application/pdf");
	       DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
	       String currentDateTime = dateFormatter.format(new Date());
	       String headerKey = "Content-Disposition";
	       String headerValue = "attachment; filename=Rekapitulasi By Customer BPJS " + currentDateTime + ".pdf";
	       response.setHeader(headerKey, headerValue);
	       servRRCFN3BP.tJaReportRekapCusfaktNew3BP(period, cuscode, response);
	     //  return "Report Has bee Download";
	    }
	 
	 @GetMapping("/pdf/reportrekapfaktnew5")
	 public void RFN5createPDF(String period, HttpServletResponse response) throws IOException, JRException {
	       response.setContentType("application/pdf");
	       DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
	       String currentDateTime = dateFormatter.format(new Date());
	       String headerKey = "Content-Disposition";
	       String headerValue = "attachment; filename=Rekapitulasi By No Faktur COD " + currentDateTime + ".pdf";
	       response.setHeader(headerKey, headerValue);
	       servRRFN5.ReportRekapFaktNew5(period, response);
	     //  return "Report Has bee Download";
	    }
	 
	 @GetMapping("/pdf/reportrekapfaktnew2")
	 public void RFN2createPDF(String period, HttpServletResponse response) throws IOException, JRException {
	       response.setContentType("application/pdf");
	       DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
	       String currentDateTime = dateFormatter.format(new Date());
	       String headerKey = "Content-Disposition";
	       String headerValue = "attachment; filename=Rekapitulasi By No Faktur " + currentDateTime + ".pdf";
	       response.setHeader(headerKey, headerValue);
	       servRRFN2.ReportRekapFaktNew2(period, response);
	     //  return "Report Has bee Download";
	    }

}
