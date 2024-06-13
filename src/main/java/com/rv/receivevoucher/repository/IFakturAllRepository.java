package com.rv.receivevoucher.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.rv.receivevoucher.models.FakturAll;
import com.rv.receivevoucher.models.VFakturMaster;

import java.util.List;

@Repository
public interface IFakturAllRepository extends JpaRepository<FakturAll, String> {
	
	   @Query(value = "SELECT * FROM FAKTUR_MASTER_ALL S WHERE TO_CHAR(S.FM_DATE,'Monyyyy')=?1",nativeQuery = true)
	    public  List<FakturAll> getFakturAllDate(String dt);
	  
	  public List<FakturAll> findByFmNo (String fmno);

}
