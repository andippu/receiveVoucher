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
    public List<BiayaAnalisaMaster> getAnaliasMStList(String baType){
        return servBiAnMst.getAnaliasMStList(baType);
    }
}
