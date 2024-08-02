package com.rv.receivevoucher.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.rv.receivevoucher.models.ReportRekapFakturtNew2Ba;


@Repository
public interface IReportRekapFakturtNew2Ba  extends JpaRepository<ReportRekapFakturtNew2Ba, String>{
	
	public List<ReportRekapFakturtNew2Ba> findByRrfnbaPeriod (String period);

}
