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
public class VTUploadPbOtomatisCompKey implements Serializable {
	
	private String vtupoPbNo;
	 
	 private String vtupoSpNo;
	 
	 private String vtupoPoNo;

}
