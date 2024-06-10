package com.rv.receivevoucher.repository;

import com.rv.receivevoucher.models.DataRekapCust;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface IDataRekapCustRepository extends JpaRepository <DataRekapCust,String>{
	
	@Procedure(procedureName = "P_DATA_REKAP_CUST")
    String getDataRekapCust(String P_DISTCODE, String P_TYPE, String P_DATE, String P_MATERAI,
            String P_MATERAI2, String P_MATERAI3);

}
