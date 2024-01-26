package com.rv.receivevoucher.controllers;

import com.rv.receivevoucher.models.DetilSalesOrder;
import com.rv.receivevoucher.services.ServiceDetailOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@CrossOrigin("http://localhost:4200")
public class ControllerDetailOrder {

    @Autowired
    ServiceDetailOrder servDso;

    @GetMapping("/dso/getDsoByNo")
    public List<DetilSalesOrder> getDetilOrders(String dsoNo){
        return servDso.getDetilOrders(dsoNo);
    }
}
