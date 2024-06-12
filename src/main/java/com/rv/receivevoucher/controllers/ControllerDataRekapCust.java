package com.rv.receivevoucher.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rv.receivevoucher.models.DataRekapCust;
import com.rv.receivevoucher.services.ServiceDataRekapCust;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerDataRekapCust {
	@Autowired
	ServiceDataRekapCust servDrcs;
	
	@GetMapping("/fakmas/datarkpcust")
	public String getDataRekapCust(String P_DISTCODE, String P_TYPE, String P_DATE, String P_MATERAI,
            String P_MATERAI2, String P_MATERAI3) {
		 System.out.println("aaaaa :"+P_DATE);
		return servDrcs.getDataRekapCust(P_DISTCODE, P_TYPE, P_DATE, P_MATERAI, P_MATERAI2, P_MATERAI3);
	}
	 
	@GetMapping("/fakmas/datarkpcustlist")
	 public List<DataRekapCust> getDtRkpCust (){
			return servDrcs.getDtRkpCustList();
	}
	 
	
}
