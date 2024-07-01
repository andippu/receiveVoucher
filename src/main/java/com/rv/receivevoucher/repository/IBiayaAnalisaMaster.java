package com.rv.receivevoucher.repository;

import com.rv.receivevoucher.models.BiayaAnalisaMaster;
import com.rv.receivevoucher.models.DistBayarMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBiayaAnalisaMaster extends JpaRepository <BiayaAnalisaMaster,String> {
    List<BiayaAnalisaMaster> findByBaTipe(String baType);

    @Query(value = "SELECT * FROM BIAYA_ANALISA_MASTER S WHERE TO_CHAR(S.BA_DATE,'Monyyyy')=?1 AND S.TIPE=?2 ORDER BY S.BA_DATE ",nativeQuery = true)
    List<BiayaAnalisaMaster> getBiAnMstDate(String dt, String tp);
    
   public BiayaAnalisaMaster findBybaFmNo(String fmNo);
   
   public  List<BiayaAnalisaMaster> findByBaLunas(Integer status);
   
}
