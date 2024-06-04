package com.rv.receivevoucher.repository;

import com.rv.receivevoucher.models.ReturJual;
import com.rv.receivevoucher.models.TRekapSpbToExcel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Date;
import java.util.List;

@Repository
public interface ITRekapSpbToExcelRepository extends JpaRepository<TRekapSpbToExcel,String>{
	
	@Procedure(procedureName = "P_REKAP_SPB_TO_EXCEL")
	public String runPRSTE(String P_DATE);

}
