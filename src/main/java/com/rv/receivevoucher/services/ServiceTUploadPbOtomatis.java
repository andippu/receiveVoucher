package com.rv.receivevoucher.services;

import jakarta.ws.rs.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.rv.receivevoucher.models.TClaimDiscount;
import com.rv.receivevoucher.models.TUploadPbOtomatis;
import com.rv.receivevoucher.repository.ITClaimDiscountRepository;
import com.rv.receivevoucher.repository.ITUploadPbOtomatisRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceTUploadPbOtomatis {
	@Autowired
	ITUploadPbOtomatisRepository repoTupo;
	
	public List<TUploadPbOtomatis> getTupoList(){
		return repoTupo.findAll();
	}
}
