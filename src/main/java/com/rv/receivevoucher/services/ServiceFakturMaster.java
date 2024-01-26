package com.rv.receivevoucher.services;

import com.rv.receivevoucher.models.FakturMaster;
import com.rv.receivevoucher.repository.IFakturMasterRepository;
import com.rv.receivevoucher.repository.IVFakturMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceFakturMaster {

    @Autowired
    IFakturMasterRepository repoFM;

    public List<FakturMaster> getFakturByNo(String fktNo){
        return repoFM.getFakturByNoFaktur(fktNo);
    }

}
