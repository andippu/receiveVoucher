package com.rv.receivevoucher.controllers;

import com.rv.receivevoucher.models.DetilSalesOrder;
import com.rv.receivevoucher.models.DistBayarDetail;
import com.rv.receivevoucher.services.ServiceDetailOrder;
import com.rv.receivevoucher.services.ServiceDistBayarDetail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControllerDistBayarDetail {
	@Autowired 
	ServiceDistBayarDetail servDistByr;
	
	@GetMapping("/byrdistdetail/getbyrdistdtllist")
	public List<DistBayarDetail> getByrDetail(String byrId){
		return servDistByr.getByrDetail(byrId);
	}

}
