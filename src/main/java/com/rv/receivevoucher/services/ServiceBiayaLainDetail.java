package com.rv.receivevoucher.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.rv.receivevoucher.models.BiayaAnalisaDetail;
import com.rv.receivevoucher.models.BiayaLainDetail;
import com.rv.receivevoucher.repository.IBiayaLainDetailRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
@Service

public class ServiceBiayaLainDetail {
	@Autowired
	IBiayaLainDetailRepository repoBild;
	
	 public  List<BiayaLainDetail> getJualLainDetail(String fmNo){
	       return repoBild.findByBildFmNo(fmNo);
	    }

	    public  BiayaLainDetail getJualLainDetailsingle(BigDecimal bldno){
	        return repoBild.findByBildNo(bldno);
	    }

}
