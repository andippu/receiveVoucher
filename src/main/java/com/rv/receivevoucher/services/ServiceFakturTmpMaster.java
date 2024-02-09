package com.rv.receivevoucher.services;

import com.rv.receivevoucher.models.FakturTmpMaster;
import com.rv.receivevoucher.repository.IFakturTmpMaster;
import jakarta.ws.rs.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;


import java.util.List;

@Service
public class ServiceFakturTmpMaster {

    @Autowired
    IFakturTmpMaster repoFTM;
    public List<FakturTmpMaster> getFakturTmpMas (){
        return repoFTM.findAll();
    }

    public String exePUploadSpbs(){
        return repoFTM.exePUploadSpb();
    }

    public FakturTmpMaster getTfmById(Integer ftmno){
        return repoFTM.findByFtmNo(ftmno);
    }
/*
   public String updateTFm(Integer ftmNo, String cusId, String cusname){

       FakturTmpMaster existingFaktur = repoFTM.findById(ftmNo)
                .orElseThrow(() -> new NotFoundException("SPB not found with no: " + ftmNo));
        // Update fields
        existingFaktur.setFtmCustId(cusId);
        existingFaktur.setFtmCustName(cusname);
        existingFaktur.setFtmCustFlag("Y");
        repoFTM.save(existingFaktur);

        return "Update Successfuly";


    }
*/

}