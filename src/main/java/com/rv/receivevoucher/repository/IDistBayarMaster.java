package com.rv.receivevoucher.repository;

import com.rv.receivevoucher.models.DistBayarMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IDistBayarMaster extends JpaRepository <DistBayarMaster,String> {

    @Query(value = "SELECT * FROM MASTER_BAYAR_DISTRIBUTOR S WHERE TO_CHAR(MBD_INPUT_DATE,'Mon dd yyyy')=?1",nativeQuery = true)
    public List<DistBayarMaster> getByrMsByDate(String dt);
    
    
}
