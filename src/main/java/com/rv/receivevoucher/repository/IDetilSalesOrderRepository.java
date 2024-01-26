package com.rv.receivevoucher.repository;

import com.rv.receivevoucher.models.DetilSalesOrder;
import com.rv.receivevoucher.models.DetilSalesOrderCompKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IDetilSalesOrderRepository extends JpaRepository<DetilSalesOrder, DetilSalesOrderCompKey> {

    @Query(value="select s from DetilSalesOrder s where s.dsoMsoNo=?1 ")
    public List<DetilSalesOrder> getDetilOrder(String dsoNo);


}
