package com.rv.receivevoucher.controllers;

import com.rv.receivevoucher.models.BiayaAnalisaDetail;
import com.rv.receivevoucher.services.ServiceBiayaAnalisaDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class ControllerBiayaAnalisaDetail {
    @Autowired
    ServiceBiayaAnalisaDetail servBiAnDtl;

    @GetMapping("/biandtl/getbiandtllist")
    public  List<BiayaAnalisaDetail> getAnalisaDetail(String fmNo){
        return servBiAnDtl.getAnalisaDetail(fmNo);
    }

    @GetMapping("/biandtl/getbiandtlsingle")
    public  BiayaAnalisaDetail getAnalisaDetailsingle(String fmNo, String fmName){
        return servBiAnDtl.getAnalisaDetailsingle(fmNo, fmName);
    }
}
