package com.rv.receivevoucher.services;


import jakarta.ws.rs.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.rv.receivevoucher.models.TRekapSpbToExcel;
import com.rv.receivevoucher.repository.ITRekapSpbToExcelRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceTRekapSpbToExcel {
	@Autowired
	ITRekapSpbToExcelRepository repoRSTE;
	
	public List<TRekapSpbToExcel> getSpbToExcel(String pdate){		
	String temp = repoRSTE.runPRSTE(pdate);	
	System.out.println("hasil proc :"+temp);
		return repoRSTE.findAll();
	}

}
