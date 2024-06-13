package com.rv.receivevoucher.repository;

import com.rv.receivevoucher.models.ReturJual;
import com.rv.receivevoucher.models.SalesOrderAll;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Repository
public interface ISalesOrderAll  extends JpaRepository<SalesOrderAll, String> {
   
	public List<SalesOrderAll> findBySolFmNo(String fmno);
	
	public List<SalesOrderAll> findBySolDsoMsoNo(String msono);
}
