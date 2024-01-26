package com.rv.receivevoucher.controllers;

import com.rv.receivevoucher.models.UploadLog;
import com.rv.receivevoucher.services.ServiceUploadLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControllerUploadLog {
    @Autowired
    ServiceUploadLog servUpLog;

    @GetMapping("/uploadlog")
    public List<UploadLog> getAllLog(){
        return servUpLog.getAllLog();
    }

    @GetMapping("/uploadlogerr")
    public Integer getErrLog(){
        return servUpLog.getErrLog();
    }
}
