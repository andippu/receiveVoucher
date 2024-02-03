package com.rv.receivevoucher.repository;

import com.rv.receivevoucher.models.BiayaAnalisaMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBiayaAnalisaMaster extends JpaRepository <BiayaAnalisaMaster,String> {
    List<BiayaAnalisaMaster> findByBaTipe(String baType);
}
