package com.rv.receivevoucher.services;

import jakarta.ws.rs.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.rv.receivevoucher.models.FakturAll;
import com.rv.receivevoucher.repository.IFakturAllRepository;

import java.util.List;
import java.util.Optional;
@Service
public class ServiceFakturAll {
	@Autowired
	IFakturAllRepository repoFAll;
	
	public List<FakturAll> getFakturAllDate (String pdate){
		return repoFAll.getFakturAllDate(pdate);
	}
	
	public List<FakturAll> getFakturAllCu (String fmno){
		return repoFAll.findByFmNo(fmno);
	}
	
	public String saveUpdateFakturAll ( FakturAll fall) {
		repoFAll.save(fall);
		return "Submit Successfully";
	}
	
	public String exehitTotalForm(String p_fmno) {
		return repoFAll.hitTotalForm(p_fmno);
	}
}
