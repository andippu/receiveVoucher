package com.rv.receivevoucher.services;

import com.rv.receivevoucher.models.FakturTmpMaster;
import com.rv.receivevoucher.models.LovFaktur;
import com.rv.receivevoucher.repository.IFakturTmpMaster;
import com.rv.receivevoucher.repository.ILovFaktur;

import jakarta.ws.rs.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;


import java.util.List;

@Service
public class ServiceLovFaktur {
	@Autowired
	ILovFaktur repoLovFak;
	
	public List<LovFaktur> getLovFakturAll(String custCd){
		return repoLovFak.findByLfmCustCode(custCd);
		
	}

}
