package com.rv.receivevoucher.controllers;

import com.rv.receivevoucher.models.BiayaAnalisaMaster;


import com.rv.receivevoucher.services.ServiceBiayaAnalisaMaster;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class ControllerBiayaAnalisaMaster {
    @Autowired
    ServiceBiayaAnalisaMaster servBiAnMst;

    @GetMapping("/bianmst/getbianmstlist")
    public List<BiayaAnalisaMaster> getAnaliasMstList(String dt, String baType){
        System.out.println("tgl :"+dt);
        return servBiAnMst.getAnaliasMStList(dt, baType);
    }
    
    @GetMapping("/bianmst/getbianmstsingle")
    public BiayaAnalisaMaster getAnaliasMStSingle (String fmNo) {
      return servBiAnMst.getAnaliasMStSingle(fmNo);
    }
    
    @GetMapping("/bianmst/getbianblmlunas")
    public List<BiayaAnalisaMaster> getBiayaAnalisaBlmLunas(){
    	Integer status=0;
        return servBiAnMst.getBiayaAnalisaBlmLunas(status);
    }
}