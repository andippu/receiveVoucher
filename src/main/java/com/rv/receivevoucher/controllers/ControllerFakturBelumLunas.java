package com.rv.receivevoucher.controllers;



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

    public List<VFakturBelumLunas> getFakBlmLunas(){
        return servFtBlLs.getFakBlmLunas();
    }
}
