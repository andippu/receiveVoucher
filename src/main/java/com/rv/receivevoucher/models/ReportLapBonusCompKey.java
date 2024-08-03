package com.rv.receivevoucher.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ReportLapBonusCompKey implements Serializable {
	 private String rlboFmNo;
	 private String rlboBatchNo;

}
