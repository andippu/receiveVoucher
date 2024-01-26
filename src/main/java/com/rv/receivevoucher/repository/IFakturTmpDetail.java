package com.rv.receivevoucher.repository;

import com.rv.receivevoucher.models.FakturMaster;
import com.rv.receivevoucher.models.FakturTmpDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IFakturTmpDetail extends JpaRepository<FakturTmpDetail, Integer> {
    @Query(value = "select s from FakturTmpDetail s where s.ftdFtmNo=?1 ")
    public List<FakturTmpDetail> getFakturTmpDtl(Integer fmdNo);
}
