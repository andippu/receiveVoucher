package com.rv.receivevoucher.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.rv.receivevoucher.models.VTUploadPbOtomatis;
import com.rv.receivevoucher.models.VTUploadPbOtomatisCompKey;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IVTUploadPbOtomatis extends JpaRepository<VTUploadPbOtomatis, VTUploadPbOtomatisCompKey>{
	@Procedure(procedureName = "P_CHECK_PB_OTOMATIS")
	public String execCheckUpload();
	
	@Procedure(procedureName = "INSERT_DATA")
	public String execInsertUpload();

}
