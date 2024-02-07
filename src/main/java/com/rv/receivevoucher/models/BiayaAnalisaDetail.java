package com.rv.receivevoucher.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "BIAYA_ANALISA_DETAIL")
@IdClass(BiayaAnalisaDtlCompKey.class)
public class BiayaAnalisaDetail {

    @Id
    @Column (name="BA_FM_NO")
    private String badFmNo;

    @Id
    @Column (name="BA_NAME")
    private String badName;

    @Column (name="PPH23")
    private Long badPph23;

    @Column (name="ppn")
    private Long badPpn;

    @Column (name="MATERAI")
    private Long badMaterai;

    @Column (name="BA_AMOUNT")
    private Long badAmount;



}
