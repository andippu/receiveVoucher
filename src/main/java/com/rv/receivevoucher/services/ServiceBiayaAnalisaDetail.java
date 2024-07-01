package com.rv.receivevoucher.services;

import com.rv.receivevoucher.models.BiayaAnalisaDetail;
import com.rv.receivevoucher.models.BiayaAnalisaMaster;
import com.rv.receivevoucher.repository.IBiayaAnalisaDetail;
import com.rv.receivevoucher.repository.IBiayaAnalisaMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;
@Service
public class ServiceBiayaAnalisaDetail {
    @Autowired
    IBiayaAnalisaDetail repoBiAnDtl;

    public  List<BiayaAnalisaDetail> getAnalisaDetail(String fmNo){
       return repoBiAnDtl.findByBadFmNo(fmNo);
    }

    public  BiayaAnalisaDetail getAnalisaDetailsingle(String fmNo, String fmName){
        return repoBiAnDtl.findByBadFmNoAndBadName(fmNo, fmName);
    }
    
    public String saveUpdateBiayaAnalisaDtl( BiayaAnalisaDetail bad) {
    	repoBiAnDtl.save(bad);
    	return "Submit Successfully";
    }
}
