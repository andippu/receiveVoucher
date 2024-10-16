package com.rv.receivevoucher.controllers;

import com.rv.receivevoucher.models.FakturMaster;
import com.rv.receivevoucher.services.ServiceFakturMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@RestController
//@CrossOrigin("http://localhost:4200")
public class ControllerFaktur {
    @Autowired
    ServiceFakturMaster servFM;
    private final Path fileStorageLocation = Paths.get("D:\\UPLOADFILES");

    @GetMapping("/fakmas/getFakturByNo")
    public List<FakturMaster> getFakturByNo(String fktNo) {
        return servFM.getFakturByNo(fktNo);
    }
    
    @GetMapping("/fakmas/getFakturBlmLunas")
    public List<FakturMaster> getFakturBlmLunas() {
    	String status="0";
        return servFM.getFakturBlmLunas(status);
    }
    
    @GetMapping("/fakmas/hitungulangfaktur")
    public String runHitungUlangFaktur(String P_FKT, String P_FKT2) {
    	return servFM.runHitungUlangFaktur(P_FKT, P_FKT2);
    }
    
    @GetMapping("/fakmas/deletefaktur")
    public String deleteFaktur(String p_fmno) {
    	return servFM.deleteFaktur(p_fmno);
    }
    
    @GetMapping("/fakmas/pelunasanfaktur")
    public String lunasFaktur(String p_fmno, String p_type) {
    	return servFM.lunasFaktur(p_fmno, p_type);
    }
    
    //closing monthly
    
    @GetMapping("/closerv/runlappiutangexcel")
	public ResponseEntity<Resource> RunLapPiutangExcel(@RequestParam  String akhir) {
	    	String temp = servFM.RunLapPiutangExcel(akhir);
	    	String filename="LAPORAN PIUTANG "+akhir+".xml";
	    	String fl=filename.replace("/","");
	    	System.out.println("aaaaa : "+fl);
	        try {		        	
	            Path filePath = fileStorageLocation.resolve(fl).normalize();
	            Resource resource = new UrlResource(filePath.toUri());
	            if (resource.exists()) {
	                String contentType = "application/octet-stream";
	                return ResponseEntity.ok()
	                        .contentType(org.springframework.http.MediaType.parseMediaType(contentType))
	                        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
	                        .body(resource);
	            } else {
	                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
	            }
	        } catch (IOException ex) {
	            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
	        }
	}
    
    @GetMapping("/closerv/runumurpiutangexcel")
	public ResponseEntity<Resource> RunLapUmurPiutangExcel(@RequestParam  String akhir) {
	    	String temp = servFM.runLapUmurPiutangExcel(akhir);
	    	String filename="LAPORAN UMUR PIUTANG "+akhir+".xml";
	    	String fl=filename.replace("/","");
	    	System.out.println("aaaaa : "+fl);
	        try {		        	
	            Path filePath = fileStorageLocation.resolve(fl).normalize();
	            Resource resource = new UrlResource(filePath.toUri());
	            if (resource.exists()) {
	                String contentType = "application/octet-stream";
	                return ResponseEntity.ok()
	                        .contentType(org.springframework.http.MediaType.parseMediaType(contentType))
	                        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
	                        .body(resource);
	            } else {
	                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
	            }
	        } catch (IOException ex) {
	            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
	        }
	}
    
    @GetMapping("/closerv/runsuratpiutangexcel")
	public ResponseEntity<Resource> RunLapSuratPiutangExcel(@RequestParam  String akhir) {
	    	String temp = servFM.runSuratPiutangExcel(akhir);
	    	String filename="SURAT PIUTANG "+akhir+".xml";
	    	String fl=filename.replace("/","");
	    	System.out.println("aaaaa : "+fl);
	        try {		        	
	            Path filePath = fileStorageLocation.resolve(fl).normalize();
	            Resource resource = new UrlResource(filePath.toUri());
	            if (resource.exists()) {
	                String contentType = "application/octet-stream";
	                return ResponseEntity.ok()
	                        .contentType(org.springframework.http.MediaType.parseMediaType(contentType))
	                        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
	                        .body(resource);
	            } else {
	                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
	            }
	        } catch (IOException ex) {
	            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
	        }
	}
    
    @GetMapping("/closerv/runclosing")
    public String runClosingAR(String bulan) {
		return servFM.runClosingAR(bulan);
	}
	
    @GetMapping("/closerv/runpnjlu")
	public String runJurnalPnjlu(String bulan) {
		return servFM.runJurnalPnjlu(bulan);
	}
	
    @GetMapping("/closerv/runpdpt")
	public String runJurnalPdpt(String bulan) {
		return servFM.runJurnalPdpt(bulan);
	}

}
