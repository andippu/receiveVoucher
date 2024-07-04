package com.rv.receivevoucher.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import com.rv.receivevoucher.models.TUploadPbOtomatis;
import com.rv.receivevoucher.repository.ITUploadPbOtomatisRepository;
import com.rv.receivevoucher.services.ServiceTUploadPbOtomatis;

import java.awt.*;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Optional;


@CrossOrigin(origins ={ "https://localhost:4200","https://localhost:9501"}, maxAge = 3600)
@RestController
public class ControllerTUploadPbOtomatis {
	@Autowired
	ServiceTUploadPbOtomatis servTupo;
	
	@GetMapping("/pboto/gettupolist")
	public List<TUploadPbOtomatis> getTupoList(){
		return servTupo.getTupoList();
	}

}
