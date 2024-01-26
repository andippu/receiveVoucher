package com.rv.receivevoucher.services;


import com.rv.receivevoucher.models.DistBayarMaster;
import com.rv.receivevoucher.repository.IDistBayarMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ServiceDistBayarMaster {

    @Autowired
    IDistBayarMaster repoDistByMs;

    public List<DistBayarMaster> getAllByDate(String dt){
        System.out.println("test dt :"+dt);
          return repoDistByMs.getByrMsByDate(dt);
    }
    
    public Optional<DistBayarMaster> getByrMst(String dt){
        System.out.println("test dt :"+dt);
          return repoDistByMs.findById(dt);
    }

    
    
}
