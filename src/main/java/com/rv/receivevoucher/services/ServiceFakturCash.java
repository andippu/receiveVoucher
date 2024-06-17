package com.rv.receivevoucher.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rv.receivevoucher.models.ReportFakturCash;
import com.rv.receivevoucher.repository.IReportFakturCashRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceFakturCash {
	@Autowired
	IReportFakturCashRepository repoRFc;
	
	public List<ReportFakturCash> getFakturCashList(String pdate, String ttd){
		return repoRFc.findByRfcsDate(pdate);
	}

}
