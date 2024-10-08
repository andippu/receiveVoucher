package com.rv.receivevoucher.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.rv.receivevoucher.models.ReportFakturCash;
import com.rv.receivevoucher.models.ReportFakturCashCompKey;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IReportFakturCashRepository extends JpaRepository<ReportFakturCash,ReportFakturCashCompKey> {
	
	@Procedure(procedureName = "P_FAKTUR_CASH")
    String getFakturCash(String pdate, String pcusno, String pfm_awl, String pfm_akh, String pstatus);


}
