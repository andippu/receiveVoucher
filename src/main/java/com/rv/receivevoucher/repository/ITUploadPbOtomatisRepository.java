package com.rv.receivevoucher.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.rv.receivevoucher.models.TUploadPbOtomatis;
import com.rv.receivevoucher.models.TUploadPbOtomatisCompKey;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;

import java.util.List;

@Repository
@CrossOrigin("http://localhost:4200")
public interface ITUploadPbOtomatisRepository  extends JpaRepository <TUploadPbOtomatis,TUploadPbOtomatisCompKey> {
	public List<TUploadPbOtomatis> findByTupoPbNo(String pbno);
	
	@Procedure(procedureName = "P_CSV_SPB_OTO")
	public String exeCsvPbOto();
	
	

}
