package com.rv.receivevoucher.repository;

import com.rv.receivevoucher.models.FakturTmpMaster;
import com.rv.receivevoucher.models.UploadLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUploadLog extends JpaRepository<UploadLog, Integer> {
    List<UploadLog> findAllByOrderByUplogId();

    @Query("select count(1) from UploadLog s")
    public Integer getCtLogErr();
}
