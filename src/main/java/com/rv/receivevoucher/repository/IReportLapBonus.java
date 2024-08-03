package com.rv.receivevoucher.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.rv.receivevoucher.models.ReportLapBonus;
import com.rv.receivevoucher.models.ReportLapBonusCompKey;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IReportLapBonus extends JpaRepository<ReportLapBonus, ReportLapBonusCompKey>{
	public List<ReportLapBonus> findByRlboPeriod(String pbulan);

}
