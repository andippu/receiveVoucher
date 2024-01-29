package com.rv.receivevoucher.controllers;

import com.rv.receivevoucher.models.DetilSalesOrder;
import com.rv.receivevoucher.models.DistBayarDetail;
import com.rv.receivevoucher.services.ServiceDetailOrder;
import com.rv.receivevoucher.services.ServiceDistBayarDetail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ControllerDistBayarDetail {
	@Autowired 
	ServiceDistBayarDetail servDistByr;
	
	@GetMapping("/byrdistdetail/getbyrdistdtllist")
	public List<DistBayarDetail> getByrDetail(String byrId){
		return servDistByr.getByrDetail();
	}

	@GetMapping("/byrdistdetail/getbyrdistdtlid")
	public Optional<DistBayarDetail> getDistByrSingle(Long id){
		return servDistByr.getDistByrSingle(id);
	}

	@PostMapping("/byrdistdetail/saveupdatedistbyrdtl")
	public String updateSaveEntity(@RequestBody DistBayarDetail updatedEntity) {
		servDistByr.updateSaveEntity(updatedEntity);
		return "Submit Successfully";
	}

	@DeleteMapping("/byrdistdetail/deleteDistByrDtl")
	public String delDistByrSingle(Long id){
		servDistByr.delDistByrSingle(id);
		return "Delete Successfully";
	}





}
