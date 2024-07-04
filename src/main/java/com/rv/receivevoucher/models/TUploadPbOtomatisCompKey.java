package com.rv.receivevoucher.models;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TUploadPbOtomatisCompKey {
  
	 private String tupoPbNo;  
	  
	 private String tupoSpNo;  
	 
	 private String tupoProductId;  

}
