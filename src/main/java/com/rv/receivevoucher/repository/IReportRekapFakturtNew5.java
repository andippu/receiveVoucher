package com.rv.receivevoucher.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.rv.receivevoucher.models.ReportRekapFakturtNew5;



@Repository
@CrossOrigin("http://localhost:4200")
public interface IReportRekapFakturtNew5 extends JpaRepository<ReportRekapFakturtNew5, String> {
	
	public List<ReportRekapFakturtNew5> findByRrcfPeriodOrderByRrcfFmDate(String period);

}
