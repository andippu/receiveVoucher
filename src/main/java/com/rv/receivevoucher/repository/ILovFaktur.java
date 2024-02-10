package com.rv.receivevoucher.repository;

import com.rv.receivevoucher.models.LovFaktur;
import com.rv.receivevoucher.models.LovFakturCompKey;
import com.rv.receivevoucher.models.MasterSalesOrder;
import com.rv.receivevoucher.models.MasterSalesOrderCompKey;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin("http://localhost:4200")
public interface ILovFaktur  extends JpaRepository<LovFaktur, LovFakturCompKey> {
	
	List<LovFaktur> findByLfmCustCode(String custcd);

}
