package com.rv.receivevoucher.controllers;

import com.rv.receivevoucher.models.ReturJual;
import com.rv.receivevoucher.models.TRekapSpbToExcel;
import com.rv.receivevoucher.services.ServiceReturJual;
import com.rv.receivevoucher.services.ServiceTRekapSpbToExcel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Optional;


@CrossOrigin(origins ={ "https://localhost:4200","https://localhost:9501"}, maxAge = 3600)
@RestController
public class ControllerTRekapSpbToExcel {
	@Autowired
	ServiceTRekapSpbToExcel servSTRTE;
	
	 @GetMapping("/strte/getstrtelist")
	public List<TRekapSpbToExcel> getSpbToExcel(String pdate){		
		return servSTRTE.getSpbToExcel(pdate);
	}
	
	
}
