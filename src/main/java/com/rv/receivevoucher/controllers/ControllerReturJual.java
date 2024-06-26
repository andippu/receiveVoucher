package com.rv.receivevoucher.controllers;

import com.rv.receivevoucher.models.ReturJual;
import com.rv.receivevoucher.services.ServiceReturJual;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.io.IOException;
import java.util.List;
import java.util.Optional;


@CrossOrigin(origins ={ "https://localhost:4200","https://localhost:9501"}, maxAge = 3600)
@RestController
public class ControllerReturJual {
    @Autowired
    ServiceReturJual servretjl;

    @GetMapping("/returjual/getreturjuallist")
    public List<ReturJual> getReturJualList (String dt){
        return servretjl.getReturJualList(dt);
    }
    
    @GetMapping("/returjual/getreturjualById")
    public Optional<ReturJual> getReturJualAll(String id){
    	return servretjl.getReturJualById(id);
    }
    
    @PostMapping("/returjual/saveupdatertljl")
    public String saveUpdateReturJual(@RequestBody ReturJual dt) {
    	servretjl.saveUpdateReturJual(dt);
    	return "Sumbit Successfully";
    }

}
