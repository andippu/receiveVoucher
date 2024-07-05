package com.rv.receivevoucher.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rv.receivevoucher.models.VTUploadPbOtomatis;
import com.rv.receivevoucher.repository.IVTUploadPbOtomatis;

import jakarta.transaction.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ServiceVTUploadPbOtomatis {
	@Autowired
	IVTUploadPbOtomatis repoVTUPO;
	
	public List<VTUploadPbOtomatis> getVTUPOList(){
		return repoVTUPO.findAll();
	}

}
