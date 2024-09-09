package com.rv.receivevoucher.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ReportFakturCashCompKey {
	 private String rfcsFmNo;
	 private String rfcsBarang;
	 private BigDecimal rfcsBrgQty;
}
