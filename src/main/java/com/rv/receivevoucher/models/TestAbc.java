package com.rv.receivevoucher.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TESTACB")
public class TestAbc {

    @Id
    @Column(name="ABC",length=10,  nullable = false)
    private String pbNoSPb;

    @Column(name="DEF")
    private Integer pbMsoSeq;

    @Column(name="GHI",length=10)
    private String pbMsoNo;


}
