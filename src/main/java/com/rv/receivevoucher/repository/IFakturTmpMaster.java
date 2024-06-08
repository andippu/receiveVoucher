package com.rv.receivevoucher.repository;

import com.rv.receivevoucher.models.FakturTmpMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IFakturTmpMaster extends JpaRepository<FakturTmpMaster,Integer> {
    @Procedure(procedureName = "P_UPLOAD_SPB")
    public String exePUploadSpb();
    
    @Procedure(procedureName = "INSERT_DATA")
    public String exeInsertUpFaktur();

     public FakturTmpMaster findByFtmNo(Integer id);
}
