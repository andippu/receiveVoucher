package com.rv.receivevoucher.controllers;

import com.netflix.discovery.converters.Auto;
import com.rv.receivevoucher.models.DistBayarMaster;
import com.rv.receivevoucher.services.ServiceDistBayarMaster;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@CrossOrigin("http://localhost:4200")

public class ControllerDistBayarMaster {
    @Autowired
    ServiceDistBayarMaster servDisByrMs;

    @GetMapping("/byrdist/getbyrdistlist")
    public List<DistBayarMaster> getAllByDate(String dt){
        return servDisByrMs.getAllByDate(dt);
    }
    
    @GetMapping("/byrdist/getbyrmst")
    public Optional<DistBayarMaster> getByrMst(String dt){
        System.out.println("test dt :"+dt);
          return servDisByrMs.getByrMst(dt);
    }
@DeleteMapping("/byrdist/delDistById")
    public String delDistPay (String id){
        return servDisByrMs.delDistPay(id);
    }
    @PostMapping("/byrdist/submitdistbyr")
    @Transactional
    public String UpdDistPay (@RequestBody DistBayarMaster distByr){
       return servDisByrMs.UpdDistPay(distByr);

    }


    
    
}
