package com.rv.receivevoucher.repository;

import com.rv.receivevoucher.models.BiayaAnalisaDetail;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBiayaAnalisaDetail extends JpaRepository <BiayaAnalisaDetail,String> {

    List<BiayaAnalisaDetail> findByBadFmNo(String fmno);
    BiayaAnalisaDetail findByBadFmNoAndBadName(String fmno, String FmName);
}
