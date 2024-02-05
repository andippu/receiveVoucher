package com.rv.receivevoucher.controllers;

import com.rv.receivevoucher.models.FakturTmpMaster;
import com.rv.receivevoucher.services.ServiceFakturTmpMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class ControllerFakturTempMaster {

    @Autowired
    ServiceFakturTmpMaster servFTM;
    @Autowired
    RestTemplate restTemplate=new RestTemplate();

    @GetMapping("/faktmpmas/getFakturAll")
    public List<FakturTmpMaster> getFakturTmpMas (){
        return servFTM.getFakturTmpMas();
    }

    @GetMapping("/faktmpmas/pUploadSPB")
    public String exePUploadSpbs(){
        return servFTM.exePUploadSpbs();
    }

    @GetMapping("/faktmpmas/getfakturbyid")
    public FakturTmpMaster getTfmById(Integer ftmno){
        return servFTM.getTfmById(ftmno);
    }
/*
    @GetMapping("/faktmpmas/updfaktur")
    public String updateFaktur(Integer ftmNo, String cusId) {
        ResponseEntity<String> responseEntity=restTemplate.getForEntity("http://localhost:9501/accmaster-svc/cust/getcustname?cusno="+cusId,
                       String.class);
        String cusname = responseEntity.getBody();
       // System.out.println("customer : "+cusId+" - "+responseEntity.getBody());
        String updated = servFTM.updateTFm(ftmNo, cusId, cusname);
       // return ResponseEntity.ok(updated);
        return updated;
    }*/
}
