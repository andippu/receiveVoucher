package com.rv.receivevoucher.services;

import com.rv.receivevoucher.models.FakturTmpMaster;
import com.rv.receivevoucher.models.UploadLog;
import com.rv.receivevoucher.repository.IFakturTmpMaster;
import com.rv.receivevoucher.repository.IUploadLog;
import jakarta.ws.rs.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;


import java.util.List;

@Service
public class ServiceUploadLog {
    @Autowired
    IUploadLog repoUpLog;

    public List<UploadLog> getAllLog(){
        return repoUpLog.findAllByOrderByUplogId();
    }

    public Integer getErrLog(){
        return repoUpLog.getCtLogErr();
    }


}
