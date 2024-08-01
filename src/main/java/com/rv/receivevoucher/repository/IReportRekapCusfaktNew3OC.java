package com.rv.receivevoucher.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.rv.receivevoucher.models.ReportRekapCusfaktNew3OC;
import com.rv.receivevoucher.models.ReportRekapCustFaktNew3;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IReportRekapCusfaktNew3OC extends JpaRepository<ReportRekapCusfaktNew3OC, String>{
	public List<ReportRekapCusfaktNew3OC> findByRrcfPeriodAndRrcfCusCodeContaining (String period, String cuscode);
}
