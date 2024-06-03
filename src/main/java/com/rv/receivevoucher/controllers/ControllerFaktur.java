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
    
    @GetMapping("/fakmas/hitungulangfaktur")
    public String runHitungUlangFaktur(String P_FKT, String P_FKT2) {
    	return servFM.runHitungUlangFaktur(P_FKT, P_FKT2);
    }
}
