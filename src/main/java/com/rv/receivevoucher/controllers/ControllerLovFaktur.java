package com.rv.receivevoucher.controllers;

import com.rv.receivevoucher.models.FakturTmpMaster;
import com.rv.receivevoucher.models.LovFaktur;
import com.rv.receivevoucher.services.ServiceFakturTmpMaster;
import com.rv.receivevoucher.services.ServiceLovFaktur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class ControllerLovFaktur {
	@Autowired
	ServiceLovFaktur servLovFak;
	
	 @GetMapping("/lovfaktur/getlovfaktur")
	public List<LovFaktur> getLovFakturAll(String custcd){
		return servLovFak.getLovFakturAll(custcd);
		
	}

}
