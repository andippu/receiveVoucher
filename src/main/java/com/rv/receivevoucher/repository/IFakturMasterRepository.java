package com.rv.receivevoucher.repository;

import com.rv.receivevoucher.models.FakturMaster;
import com.rv.receivevoucher.models.VFakturMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IFakturMasterRepository extends JpaRepository<FakturMaster,String> {
    @Query(value = "select s from FakturMaster s where s.fmNo=?1 ")
    public List<FakturMaster> getFakturByNoFaktur(String fmNo);

}
