package com.rv.receivevoucher.repository;

import com.rv.receivevoucher.models.VFakturMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IVFakturMasterRepository extends JpaRepository<VFakturMaster, String> {

    @Query(value = "select s from VFakturMaster s where s.fmInd ='Y' and ( s.vfmType = 'CA'  OR s.vfmType ='CT' ) and s.vfmDateParam=?1  ")
    public List<VFakturMaster> getFakturByCod(String dt);

    @Query(value = "select s from VFakturMaster s where s.fmInd ='Y' and ( s.vfmType = 'BP' ) and s.vfmDateParam=?1  ")
    public List<VFakturMaster> getFakturByBpjs(String dt);

    @Query(value = "select s from VFakturMaster s where s.fmInd ='Y' and ( s.vfmType = 'GN' ) and s.vfmDateParam=?1  ")
    public List<VFakturMaster> getFakturByGn(String dt);

    @Query(value = "select s from VFakturMaster s where s.fmInd ='Y' and (s.vfmType = 'CR' OR s.vfmType = 'OC') and s.vfmDateParam=?1  ")
    public List<VFakturMaster> getFakturByMst(String dt);




}
