package com.rv.receivevoucher.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.rv.receivevoucher.models.ReportRekapCusfaktNew3BP;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IReportRekapCusfaktNew3BP extends JpaRepository<ReportRekapCusfaktNew3BP, String>{
	
	public List<ReportRekapCusfaktNew3BP> findByRrcfPeriodAndRrcfCusCodeContaining (String period, String cuscode);

}
