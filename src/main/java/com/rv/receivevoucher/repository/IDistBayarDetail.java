package com.rv.receivevoucher.repository;

import com.rv.receivevoucher.models.DistBayarDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IDistBayarDetail extends JpaRepository <DistBayarDetail, Long> {

    public List<DistBayarDetail> findByDydMbdUrut(String param);

    public DistBayarDetail findByDydMbdUrutAndDydFmNo(String noUrut, String fmNo);

}
