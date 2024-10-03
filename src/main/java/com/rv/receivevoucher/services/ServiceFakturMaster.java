package com.rv.receivevoucher.services;

import com.rv.receivevoucher.models.FakturMaster;
import com.rv.receivevoucher.repository.IFakturMasterRepository;
import com.rv.receivevoucher.repository.IVFakturMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceFakturMaster {

    @Autowired
    IFakturMasterRepository repoFM;

    public List<FakturMaster> getFakturByNo(String fktNo){
        return repoFM.getFakturByNoFaktur(fktNo);
    }
    
    public List<FakturMaster> getFakturBlmLunas(String status){
        return repoFM.findByFmLunas(status);
    }
    
    public String runHitungUlangFaktur(String P_FKT, String P_FKT2) {
    	return repoFM.runHitungUlangFaktur(P_FKT, P_FKT2);
    }
    
    public String deleteFaktur(String p_fmno) {
    	return repoFM.deleteFakturMaster(p_fmno);
    }
    
    public String lunasFaktur(String p_fmno, String p_type) {
    	return repoFM.pelunasanFakturMaster(p_fmno, p_type);
    }
    
    //closing monthly
    public String RunLapPiutangExcel (String bulan) {
    	return repoFM.runLapPiutangExcel(bulan);
    }

}
