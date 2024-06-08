package com.rv.receivevoucher.repository;

import com.rv.receivevoucher.models.VFakturMasterSingle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IVFakturMasterSingle extends JpaRepository<VFakturMasterSingle,String> {
    @Query(value = "select s from VFakturMasterSingle s where s.vfmNo=?1")
    public List<VFakturMasterSingle> getFakSingleByNo(String vfmNo);

    @Query(value = "select s from VFakturMasterSingle s where vfmOto='1' and s.vfmNo>?1 and vfmDateParam=?2 and vfmType=?3 and rownum=1")
    public List<VFakturMasterSingle> getFakSingleByNoUp(String vfmNo, String vfmDateParam, String vfmType);
    
    @Procedure(procedureName = "P_FORM_FAKTUR_RECALCULATE")
    String RecalcFaktur(String P_FM_NO, String P_FM_NO_PJK);
}
