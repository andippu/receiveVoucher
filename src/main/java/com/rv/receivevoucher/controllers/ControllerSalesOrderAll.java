package com.rv.receivevoucher.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rv.receivevoucher.models.SalesOrderAll;
import com.rv.receivevoucher.services.ServiceSalesOrderAll;

@RestController
public class ControllerSalesOrderAll {
	@Autowired
	ServiceSalesOrderAll servSol;
	
	@GetMapping("/soall/getsoalllist")
	public List<SalesOrderAll> getSalesOrderAllList (String fmno){
		return servSol.getSalesOrderAllList(fmno);
	}
	
	@GetMapping("/soall/getsoallcu")
	public List<SalesOrderAll> getSalesOrderAllCU (String msno){
		return servSol.getSalesOrderAllCU(msno);
	}
	
	@PostMapping("/soall/saveupdsoall")
	public String saveUpdateSOAll(@RequestBody SalesOrderAll soal) {
		
		return servSol.saveUpdateSOAll(soal);
	}
}
