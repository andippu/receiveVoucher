package com.rv.receivevoucher.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rv.receivevoucher.models.FakturAll;
import com.rv.receivevoucher.services.ServiceFakturAll;




@RestController
public class ControllerFakturAll {
	@Autowired
	ServiceFakturAll servFAll;
	
	 @GetMapping("/fakturall/getfalllist")
	public List<FakturAll> getFakturAllDate (String pdate){
		return servFAll.getFakturAllDate(pdate);
	}
	
	 @GetMapping("/fakturall/getfallcu")
	public List<FakturAll> getFakturAllCu (String fmno){
		return servFAll.getFakturAllCu(fmno);
	}

}
