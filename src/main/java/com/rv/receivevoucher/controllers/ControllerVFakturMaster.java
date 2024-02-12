package com.rv.receivevoucher.controllers;

import com.rv.receivevoucher.models.VFakturMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rv.receivevoucher.services.ServiceVFakturMaster;

import java.util.List;

@RestController
//@CrossOrigin("http://localhost:4200")
public class ControllerVFakturMaster {

    @Autowired
    ServiceVFakturMaster ServFM;

    @GetMapping("/fakmas/getfmbymst")
    public List<VFakturMaster> getFakturByDates(String dt){
        return ServFM.getFakturByMst(dt);
    }

    @GetMapping("/fakmas/getfakbllnsbycust")
    public List<VFakturMaster> getAllFaktur(){
        return ServFM.getAllFaktur();
    }
    
    @GetMapping("/fakmas/getfmbybpjs")
    public List<VFakturMaster> getFakturByBpjs(String dt){
        return ServFM.getFakturByBpjs(dt);
    }
    
    @GetMapping("/fakmas/getfmbycod")
    public List<VFakturMaster> getFakturByCod(String dt){
        return ServFM.getFakturByCod(dt);
    }
    
    @GetMapping("/fakmas/getfmbygn")
    public List<VFakturMaster> getFakturByGn(String dt){
        return ServFM.getFakturByGn(dt);
    }


}
