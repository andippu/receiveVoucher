package com.rv.receivevoucher.controllers;

import com.rv.receivevoucher.models.FakturTmpDetail;
import com.rv.receivevoucher.services.ServiceFakturTmpDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControllerFakturTempDetail {
    @Autowired
    ServiceFakturTmpDetail servFTD;

    @GetMapping("/faktmpdtl/getfakturtmdtl")
    public List<FakturTmpDetail> getAllFakTmpDetail(Integer ftdno) {
        return servFTD.getAllFakTmpDetail(ftdno);
    }
}