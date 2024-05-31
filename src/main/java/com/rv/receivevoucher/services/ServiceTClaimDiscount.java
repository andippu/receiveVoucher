package com.rv.receivevoucher.services;


import jakarta.ws.rs.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.rv.receivevoucher.models.TClaimDiscount;
import com.rv.receivevoucher.repository.ITClaimDiscountRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceTClaimDiscount {
	@Autowired
	ITClaimDiscountRepository repoTClDis;
	
	public String runProClaimDisc (String P_DIST, String P_DATE) {
		return repoTClDis.runProClaimDisc(P_DIST, P_DATE);
	}
	
	public List<TClaimDiscount> getClaimDisc(){
		return repoTClDis.findAll();
	}
}
