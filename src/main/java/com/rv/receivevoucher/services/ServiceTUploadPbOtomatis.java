package com.rv.receivevoucher.services;

import jakarta.ws.rs.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.ap.accountpayable.models.TUploadPembelian;
import com.rv.receivevoucher.models.TClaimDiscount;
import com.rv.receivevoucher.models.TUploadPbOtomatis;
import com.rv.receivevoucher.repository.ITClaimDiscountRepository;
import com.rv.receivevoucher.repository.ITUploadPbOtomatisRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceTUploadPbOtomatis {
	@Autowired
	ITUploadPbOtomatisRepository repoTupo;
	
	 public void checkTTupo() {
	        List<TUploadPbOtomatis> tup = repoTupo.findAll(); // You can use findBy<YourField> if needed

	        if (!tup.isEmpty()) {
	        	repoTupo.deleteAll();
	            System.out.println("Data deleted successfully");
	        } else {
	            System.out.println("No data found in the table");
	        }
	  }
	
	public List<TUploadPbOtomatis> getTupoList(String pbno){
		return repoTupo.findByTupoPbNo(pbno);
	}
		
	 public String insTUpPbOto (TUploadPbOtomatis data){
		 repoTupo.save(data);
		 repoTupo.flush();
		// String temp=reporitup.execuploadbeli();
		System.out.println("temp :teUpload CSV Successmp");
	       return "Upload CSV Success";
	 }
	 
	 public String exeCsvPbOto(){
			return repoTupo.exeCsvPbOto();
		}
	 
	 
}
