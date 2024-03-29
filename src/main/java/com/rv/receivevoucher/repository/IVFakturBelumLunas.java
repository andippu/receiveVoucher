package com.rv.receivevoucher.repository;

import com.rv.receivevoucher.models.FakturBelumLunas;
import com.rv.receivevoucher.models.VFakturBelumLunas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IVFakturBelumLunas extends JpaRepository<VFakturBelumLunas,String> {
      List<VFakturBelumLunas> findByFblCustCode(String custCode);

      @Procedure(procedureName = "P_INSERT_DETIL_BLMLNS")
      String PaymentProcess(String fmNo, String noUrut, String userBy);

      @Procedure(procedureName = "JURNAL_BAYAR")
      String jurnalPaymnet(String nmr, String month, String year);
}
