package com.rv.receivevoucher.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.rv.receivevoucher.models.ReportFakturCash;
import com.rv.receivevoucher.models.ReportRekapFakturNew2;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IReportRekapFakturNew2  extends JpaRepository<ReportRekapFakturNew2,String>{
	
	public List<ReportRekapFakturNew2> findByRrcfPeriodOrderByRrcfFmDate(String period);

}
