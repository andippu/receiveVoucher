package com.rv.receivevoucher.controllers;

import com.rv.receivevoucher.models.FakturMaster;
import com.rv.receivevoucher.services.ServiceFakturMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@CrossOrigin("http://localhost:4200")
public class ControllerFaktur {
    @Autowired
    ServiceFakturMaster servFM;

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
}
