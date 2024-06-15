package com.rv.receivevoucher.services;

import jakarta.ws.rs.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.rv.receivevoucher.models.SalesOrderAll;
import com.rv.receivevoucher.repository.ISalesOrderAll;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceSalesOrderAll {
	@Autowired
	ISalesOrderAll repoSol;
	
	public List<SalesOrderAll> getSalesOrderAllList (String fmno){
		return repoSol.findBySolFmNo(fmno);
	}
	
	public List<SalesOrderAll> getSalesOrderAllCU (String msno){
		return repoSol.findBySolDsoMsoNo(msno);
	}
	
	public String saveUpdateSOAll(SalesOrderAll soal) {
		repoSol.save(soal);
		return "Submit Successfully";
	}

}
