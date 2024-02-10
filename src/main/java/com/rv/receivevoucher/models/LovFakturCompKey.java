package com.rv.receivevoucher.models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class LovFakturCompKey implements Serializable{
	String lfmFmNo;
	String lfmBrCode;
	String lfmBatchNo;
}
