package com.rv.receivevoucher.repository;

import com.rv.receivevoucher.models.ReturJual;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IReturJual extends JpaRepository<ReturJual,String>{
    @Query(value = "SELECT * FROM RETUR_JUAL S WHERE TO_CHAR(S.RJ_DATE,'Monyyyy')=?1",nativeQuery = true)
      List<ReturJual> getRetJualDate(String dt);
    


}
