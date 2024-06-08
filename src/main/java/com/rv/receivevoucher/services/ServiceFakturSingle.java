package com.rv.receivevoucher.services;

import com.rv.receivevoucher.models.FakturMaster;
import com.rv.receivevoucher.models.VFakturMasterSingle;
import com.rv.receivevoucher.repository.IVFakturMasterSingle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceFakturSingle {
    @Autowired
    IVFakturMasterSingle repoFmSingle;

    public List<VFakturMasterSingle> getFakSingleNo(String vfmNo){
        return repoFmSingle.getFakSingleByNo(vfmNo);
    }
    
    public List<VFakturMasterSingle> getFakSingleNoUp(String vfmNo, String vfmDateParam, String vfmType){
        return repoFmSingle.getFakSingleByNoUp(vfmNo, vfmDateParam, vfmType);
    }
    
    public String GetRecalcFaktur(String P_FM_NO, String P_FM_NO_PJK) {
    	return repoFmSingle.RecalcFaktur(P_FM_NO, P_FM_NO_PJK);
    }
}
