package com.rv.receivevoucher.services;

import com.rv.receivevoucher.models.TestAbc;
import com.rv.receivevoucher.repository.ITestAbcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceTestAbc {
    @Autowired
    ITestAbcRepository repoTest;

    public String insTestAbc (TestAbc tAbc){
        repoTest.save(tAbc);
        return "Sukses";
    }

}
