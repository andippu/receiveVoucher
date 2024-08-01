package com.rv.receivevoucher.repository;

import com.rv.receivevoucher.models.MasterSalesOrder;
import com.rv.receivevoucher.models.MasterSalesOrderCompKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IMasterSalesOrderRepository extends JpaRepository<MasterSalesOrder, String> {

    @Query("select s from MasterSalesOrder s where s.msoNo=?1")
    MasterSalesOrder getbylist(Integer s1, Integer S2);

}
