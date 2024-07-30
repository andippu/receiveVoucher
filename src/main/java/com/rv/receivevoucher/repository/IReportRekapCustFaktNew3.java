package com.rv.receivevoucher.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.rv.receivevoucher.models.ReportRekapCustFaktNew3;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IReportRekapCustFaktNew3 extends JpaRepository<ReportRekapCustFaktNew3, String>{
	
	public List<ReportRekapCustFaktNew3> findByRrcfPeriodAndRrcfCusCodeContaining (String period, String cuscode);

}
