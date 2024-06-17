package com.rv.receivevoucher.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.rv.receivevoucher.models.ReportFakturCash;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IReportFakturCashRepository extends JpaRepository<ReportFakturCash,String> {
	
	public List<ReportFakturCash> findByRfcsDate(String pdate);

}
