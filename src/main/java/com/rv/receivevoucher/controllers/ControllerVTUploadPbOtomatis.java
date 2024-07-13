package com.rv.receivevoucher.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


import com.rv.receivevoucher.models.VTUploadPbOtomatis;
import com.rv.receivevoucher.services.ServiceVTUploadPbOtomatis;

import java.math.BigDecimal;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")

public class ControllerVTUploadPbOtomatis {

	@Autowired
	ServiceVTUploadPbOtomatis servVTUPO;
	
	@GetMapping("/pboto/getvtupolist")
	public List<VTUploadPbOtomatis> getVTUPOList(){
		return servVTUPO.getVTUPOList();
	}
	
	@GetMapping("/pboto/execinsertupload")
	public String execInsertUpload() {
		return servVTUPO.execInsertUpload();
	}
	
	
}
