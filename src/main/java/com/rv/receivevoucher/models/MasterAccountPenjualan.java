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
@Table(name = "MASTER_ACCOUNT_PENJUALAN")
public class MasterAccountPenjualan {
	
	@Id
    @Column(name="MPJL_ID", nullable = false)
    private Integer mpjlId;
	
	 @Column(name="MPJL_VISIBLE", length=1)
	 private Integer mpjlVisible;
	 
	 @Column(name="MPJL_DESC", length=60)
	 private Integer mpjlDesc;
	 
	 @Column(name="MPJL_DEBET_CREDIT", length=1)
	 private Integer mpjlDebetCredit;
	 
	 @Column(name="MPJL_ACCNO_MAIN", length=8)
	 private String mpjlAccNoMain;
	 
	 @Column(name="MPJL_ACCNO_TYPE", length=8)
	 private String mpjlAccNoType;
	
	 @Column(name="MPJL_ACCNO_PPH22", length=8)
	 private String mpjlAccNoPph22;
	 
	 @Column(name="MPJL_ACCNO_PPH23", length=8)
	 private String mpjlAccNoPph23;
	 
	 @Column(name="MPJL_ACCNO_Ppn", length=8)
	 private String mpjlAccNoPpn;
	 
	 @Column(name="MPJL_ACCNO_POTONGAN", length=8)
	 private String mpjlAccNoPotongan;
	 
	 @Column(name="MPJL_ACCNO_SELISH", length=8)
	 private String mpjlAccNoSelisih;
	 
	 @Column(name="MPJL_POTONGAN_FLAG", length=8)
	 private String mpjlAccNoPotonganFlag;
	 





}
