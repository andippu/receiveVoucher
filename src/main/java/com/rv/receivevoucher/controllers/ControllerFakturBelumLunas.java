package com.rv.receivevoucher.controllers;



import com.rv.receivevoucher.models.FakturBelumLunas;
import com.rv.receivevoucher.models.VFakturBelumLunas;
import com.rv.receivevoucher.services.ServiceFakturBelumLunas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControllerFakturBelumLunas {
    @Autowired
    ServiceFakturBelumLunas servFtBlLs;
    @GetMapping("/fakbl/getfakbllns")
    public List<VFakturBelumLunas> getFakBlmLunas(String custCd){
        System.out.println("control");
        return servFtBlLs.getFakBlmLunas(custCd);
    }
}
