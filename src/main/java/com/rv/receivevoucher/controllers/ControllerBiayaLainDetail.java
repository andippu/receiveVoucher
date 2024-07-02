package com.rv.receivevoucher.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.rv.receivevoucher.models.BiayaAnalisaDetail;
import com.rv.receivevoucher.models.BiayaLainDetail;
import com.rv.receivevoucher.services.ServiceBiayaLainDetail;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RestController
public class ControllerBiayaLainDetail {
	@Autowired
	ServiceBiayaLainDetail servBild;
	
	 @GetMapping("/bilddtl/getbilddtllist")
	    public  List<BiayaLainDetail> getJualLainDetail(String fmNo){
	        return servBild.getJualLainDetail(fmNo);
	    }

	 @GetMapping("/bilddtl/getbilddtlsingle")
	 public  BiayaLainDetail getJualLainDetailsingle(BigDecimal bldno){
	        return servBild.getJualLainDetailsingle(bldno);
	 }
	 
	 @PostMapping("/bilddtl/addupdbelild")	
	 public String saveUpdateBiayaAnalisamaster(@RequestBody BiayaLainDetail bld) {
		 return servBild.saveUpdateBiayaAnalisamaster(bld);
	  }
	

}
