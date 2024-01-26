package com.rv.receivevoucher.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rv.receivevoucher.models.DistBayarDetail;
import com.rv.receivevoucher.repository.IDistBayarDetail;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceDistBayarDetail {
	@Autowired
	IDistBayarDetail RepoByrDtl;
	
	public List<DistBayarDetail> getByrDetail(String byrId){
		return RepoByrDtl.findByDydMbdNo(byrId);
	}
	
	public Optional<DistBayarDetail> getByrDetail(Long byrId){
		return RepoByrDtl.findById(byrId);
	}
	

}
