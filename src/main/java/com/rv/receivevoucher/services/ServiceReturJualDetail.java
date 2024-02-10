package com.rv.receivevoucher.services;

import com.rv.receivevoucher.models.ReturJual;
import com.rv.receivevoucher.models.ReturJualDetail;
import com.rv.receivevoucher.repository.IReturJual;
import com.rv.receivevoucher.repository.IReturJualDetail;
import jakarta.ws.rs.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;


@Service
public class ServiceReturJualDetail {
	@Autowired
	IReturJualDetail reportjldtl;
	
	public List<ReturJualDetail> getRtJlDtlList(String id){
		return reportjldtl.findByRjdNo(id);
	}
	
	public Optional<ReturJualDetail> getRtJlDtlSingle(String id){
		return reportjldtl.findByRjdFmNo(id);
	}
	
	public List<ReturJualDetail> getalllist(){
		return reportjldtl.findAll();
	}
	
	public String addSaveReturDetail (ReturJualDetail data) {
		reportjldtl.save(data);
		return "Submit Successfully";
	}

}
