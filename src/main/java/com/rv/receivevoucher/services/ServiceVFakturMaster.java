package com.rv.receivevoucher.services;

import com.rv.receivevoucher.models.VFakturMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rv.receivevoucher.repository.IVFakturMasterRepository;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@Service
public class ServiceVFakturMaster {

    @Autowired
    IVFakturMasterRepository repoVFM;

    public List<VFakturMaster> getFakturByMst(String dt){
        return repoVFM.getFakturByMst(dt);
    }

    public List<VFakturMaster> getAllFaktur(){
        List<VFakturMaster> allFak= repoVFM.findAll();
      // log.info("all fak : "+ allFak.size());

        return allFak;
    }
    
    public List<VFakturMaster> getFakturByBpjs(String dt){
        return repoVFM.getFakturByBpjs(dt);
    }
    
    public List<VFakturMaster> getFakturByCod(String dt){
        return repoVFM.getFakturByCod(dt);
    }
    
    public List<VFakturMaster> getFakturByGn(String dt){
        return repoVFM.getFakturByGn(dt);
    }
    
}