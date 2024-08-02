package com.rv.receivevoucher.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.rv.receivevoucher.models.ReportRekapCusfaktNew3OC;
import com.rv.receivevoucher.models.ReportRekapCustBrg;
import com.rv.receivevoucher.models.ReportRekapCustBrgCompKey;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IReportRekapCustBrg  extends JpaRepository<ReportRekapCustBrg,ReportRekapCustBrgCompKey> {
	
	@Procedure(procedureName = "BEFORE_REKAP_CUST_BRG")
	public void runBefReCustBrg( String period);
	
	public List<ReportRekapCustBrg> findByRrcbPeriodeAndRfcbCusCodeContaining (String period, String cuscode);

}
