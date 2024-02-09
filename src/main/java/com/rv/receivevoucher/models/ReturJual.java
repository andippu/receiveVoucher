package com.rv.receivevoucher.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "RETUR_JUAL")
public class ReturJual {
    @Id
    @Column(name="RJ_NO",length=50,  nullable = false)
    private String rjNo;
    
    @Column(name="CREATED_BY", length = 20)
    private String rjCreateBy;

    @Column(name="CREATED_DATE")
    private Date rjCreateDate;
    
    @Column(name="RJ_CUST_NO", length=20)
    private String rjCustNo;

    @Column(name="RJ_DATE")
    private Date rjDate;   

    @Column(name="NO_PPK", length=100)
    private String rjNoPpk;

    @Column(name="NO_SURAT", length = 50)
    private String rjNoSurat;

}
