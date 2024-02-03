package com.rv.receivevoucher.services;


import com.rv.receivevoucher.models.BiayaAnalisaMaster;
import com.rv.receivevoucher.repository.IBiayaAnalisaMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;
@Service
public class ServiceBiayaAnalisaMaster {
    @Autowired
    IBiayaAnalisaMaster repoBiAnMst;

    public List<BiayaAnalisaMaster> getAnaliasMStList(String baType){
        return repoBiAnMst.findByBaTipe(baType);
    }
}
