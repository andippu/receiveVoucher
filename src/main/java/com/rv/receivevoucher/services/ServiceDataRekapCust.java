package com.rv.receivevoucher.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.rv.receivevoucher.models.DataRekapCust;
import com.rv.receivevoucher.repository.IDataRekapCustRepository;

import java.util.List;
import java.util.Optional;
@Service
public class ServiceDataRekapCust {
	@Autowired
	IDataRekapCustRepository repoDrcs;
	
	public String getDataRekapCust(String P_DISTCODE, String P_TYPE, String P_DATE, String P_MATERAI,
            String P_MATERAI2, String P_MATERAI3) {
		return repoDrcs.getDataRekapCust(P_DISTCODE, P_TYPE, P_DATE, P_MATERAI, P_MATERAI2, P_MATERAI3);
	}
	
	public List<DataRekapCust> getDtRkpCustList (){
		return repoDrcs.findAll();
	}
}
