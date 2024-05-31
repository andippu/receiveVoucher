package com.rv.receivevoucher.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import com.rv.receivevoucher.models.TClaimDiscount;
import com.rv.receivevoucher.services.ServiceTClaimDiscount;

import java.awt.*;
import java.io.IOException;
import java.util.List;
import java.util.Optional;


@CrossOrigin(origins ={ "https://localhost:4200","https://localhost:9501"}, maxAge = 3600)
@RestController
public class ControllerTClaimDiscount {
	@Autowired
	ServiceTClaimDiscount servTClDis;
	
	@GetMapping("/claimdisc/getclaimdiscountlist")
	public List<TClaimDiscount> getClaimDiscList (String P_DIST, String P_DATE) {
		 String msg = servTClDis.runProClaimDisc(P_DIST, P_DATE);
		 System.out.println("procedure :"+msg);
		 return servTClDis.getClaimDisc();
	}

}
