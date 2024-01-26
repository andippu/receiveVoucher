package com.rv.receivevoucher.controllers;

import com.rv.receivevoucher.models.VFakturMasterSingle;
import com.rv.receivevoucher.services.ServiceFakturSingle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@CrossOrigin("http://localhost:4200")
public class ControllerFakturSingle {

    @Autowired
    ServiceFakturSingle servFMSingle;

    @GetMapping("/fmsingle/getFakturSingle")
    public List<VFakturMasterSingle> getFakSingle(String vfmNo){
        return servFMSingle.getFakSingleNo(vfmNo);
    }

    @GetMapping("/fmsingle/getFakturSingleUp")
    public List<VFakturMasterSingle> getFakSingleUp(String vfmNo,String vfmDateParam, String vfmType){
        return servFMSingle.getFakSingleNoUp(vfmNo, vfmDateParam, vfmType);
    }
}
