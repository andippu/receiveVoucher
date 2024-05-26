package com.rv.receivevoucher.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rv.receivevoucher.models.BiayaAnalisaDetail;
import com.rv.receivevoucher.models.BiayaLainDetail;

import java.math.BigDecimal;
import java.util.List;

import javax.swing.text.html.Option;

@Repository
public interface IBiayaLainDetailRepository extends JpaRepository <BiayaLainDetail, BigDecimal>{
	
	 List<BiayaLainDetail> findByBildFmNo(String fmno);
	 
	 BiayaLainDetail findByBildNo(BigDecimal bldno);

}
