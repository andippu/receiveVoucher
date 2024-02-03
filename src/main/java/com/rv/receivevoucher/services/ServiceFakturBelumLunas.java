package com.rv.receivevoucher.services;

import com.rv.receivevoucher.models.FakturBelumLunas;
import com.rv.receivevoucher.models.VFakturBelumLunas;
import com.rv.receivevoucher.repository.IVFakturBelumLunas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class ServiceFakturBelumLunas {

    @Autowired
    IVFakturBelumLunas repoFakBlLs;

    public List<VFakturBelumLunas> getFakBlmLunas(String custCode){
        return repoFakBlLs.findByFblCustCode(custCode);
    }

    public String PaymentProcess(String fmNo, String noUrut, String userBy){
        return repoFakBlLs.PaymentProcess(fmNo, noUrut, userBy);
    }
    public String jurnalPaymnet(String nmr, String month, String year){
       return repoFakBlLs.jurnalPaymnet(nmr, month, year);
    }
}
