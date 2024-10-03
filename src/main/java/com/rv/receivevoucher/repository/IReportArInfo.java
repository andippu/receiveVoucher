package com.rv.receivevoucher.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.rv.receivevoucher.models.ReportArInfo;
import com.rv.receivevoucher.models.ReportFakturCash;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IReportArInfo  extends JpaRepository<ReportArInfo, String>{
	
	public List<ReportArInfo> findByRarinFmNo(String fmno);

	
}
