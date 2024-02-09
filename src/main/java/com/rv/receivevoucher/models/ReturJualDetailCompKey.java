package com.rv.receivevoucher.models;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ReturJualDetailCompKey implements Serializable{
   private String rjdNo;
   private String rjdFmNo;
}
