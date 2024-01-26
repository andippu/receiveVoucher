package com.rv.receivevoucher.services;

import com.rv.receivevoucher.models.FakturTmpDetail;
import com.rv.receivevoucher.repository.IFakturTmpDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceFakturTmpDetail {
    @Autowired
    IFakturTmpDetail repoFTD;

    public List<FakturTmpDetail> getAllFakTmpDetail(Integer ftdno){
        return repoFTD.getFakturTmpDtl(ftdno);
    }
}
