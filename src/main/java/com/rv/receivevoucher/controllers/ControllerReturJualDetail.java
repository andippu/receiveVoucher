package com.rv.receivevoucher.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.rv.receivevoucher.models.ReturJualDetail;
import com.rv.receivevoucher.services.ServiceReturJualDetail;

public class ControllerReturJualDetail {
	@Autowired
	ServiceReturJualDetail servRtjlDtl;
	
	@GetMapping("/returjual/getreturjualdtllist")
	public List<ReturJualDetail> getRtJlDtlById(String id){
		return servRtjlDtl.getRtJlDtlById(id);
	}
	
	@GetMapping("/returjual/getreturjualdtlsingle")
	public Optional<ReturJualDetail> getRtJlDtlSingle(String id){
		return servRtjlDtl.getRtJlDtlSingle(id);
	}


}
