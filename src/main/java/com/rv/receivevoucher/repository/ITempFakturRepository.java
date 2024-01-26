package com.rv.receivevoucher.repository;


import com.rv.receivevoucher.models.VFakturMasterSingle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.rv.receivevoucher.models.TempFaktur;

import java.util.List;


@Repository
@CrossOrigin("http://localhost:4200")
public interface ITempFakturRepository extends JpaRepository<TempFaktur, String> {

    @Query("select s from TempFaktur s")
    public List<TempFaktur> getTFakAll();
}
