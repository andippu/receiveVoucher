package com.rv.receivevoucher.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rv.receivevoucher.models.ReturJualDetail;
import com.rv.receivevoucher.services.ServiceReturJualDetail;

@RestController
public class ControllerReturJualDetail {
	@Autowired
	ServiceReturJualDetail servRtjlDtl;
	
	@GetMapping("/returjualdtl/getreturjualdtllist")
	public List<ReturJualDetail> getRtJlDtlList(String id){
		return servRtjlDtl.getRtJlDtlList(id);
	}
	
	@GetMapping("/returjualdtl/getreturjualdtlsingle")
	public Optional<ReturJualDetail> getRtJlDtlSingle(String id){
		return servRtjlDtl.getRtJlDtlSingle(id);
	}
	
	@GetMapping("/returjualdtl/getreturjualdtlall")
	public List<ReturJualDetail> getalllist(){
		//System.out.println("aaaaaaa.......");
		return servRtjlDtl.getalllist();
	}
	
	@PostMapping("/returjualdtl/saveupdatertrjldtl")
	public String addSaveReturDetail (@RequestBody ReturJualDetail data) {
		return servRtjlDtl.addSaveReturDetail(data);
	}


}
