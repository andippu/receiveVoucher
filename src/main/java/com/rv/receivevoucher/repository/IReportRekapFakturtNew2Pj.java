package com.rv.receivevoucher.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.rv.receivevoucher.models.ReportRekapFakturtNew2Ba;
import com.rv.receivevoucher.models.ReportRekapFakturtNew2Pj;



@Repository
public interface IReportRekapFakturtNew2Pj extends JpaRepository<ReportRekapFakturtNew2Pj, String> {
	public List<ReportRekapFakturtNew2Pj> findByRrfnPjPeriod (String period);
}
