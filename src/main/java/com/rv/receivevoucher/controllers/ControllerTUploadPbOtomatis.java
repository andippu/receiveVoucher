package com.rv.receivevoucher.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import com.ap.accountpayable.models.TUploadPembelian;
import com.rv.receivevoucher.models.TUploadPbOtomatis;
import com.rv.receivevoucher.repository.ITUploadPbOtomatisRepository;
import com.rv.receivevoucher.services.ServiceTUploadPbOtomatis;

import java.awt.*;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Optional;


@CrossOrigin("http://localhost:4200")
@RestController
public class ControllerTUploadPbOtomatis {
	@Autowired
	ServiceTUploadPbOtomatis servTupo;
	
	 @GetMapping("/pboto/checktuppboto")
	 public String checkTUpBeli() {
		 servTupo.checkTTupo();
	     return "Check and delete Temp Faktur performed";
	 }
	
	@GetMapping("/pboto/gettupolist")
	public List<TUploadPbOtomatis> getTupoList(){
		return servTupo.getTupoList();
	}
	
	@PostMapping("/pboto/addtupoto")	  
	 public String insTUpPbOto ( @RequestBody TUploadPbOtomatis data) throws IOException {	     
	      return servTupo.insTUpPbOto(data);
	  }

}
