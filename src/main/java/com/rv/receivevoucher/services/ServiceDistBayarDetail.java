package com.rv.receivevoucher.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rv.receivevoucher.models.DistBayarDetail;
import com.rv.receivevoucher.repository.IDistBayarDetail;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceDistBayarDetail {
	@Autowired
	IDistBayarDetail RepoByrDtl;
	
	public List<DistBayarDetail> getByrDetail(){
		return RepoByrDtl.findAll();
	}

	public Optional<DistBayarDetail> getDistByrSingle(Long param1){
	   return RepoByrDtl.findById(param1);
	}

	public String delDistByrSingle(Long id){
		RepoByrDtl.deleteById(id);
		return "Delete Successfully";
	}

	public String updateSaveEntity(DistBayarDetail updatedEntity) {
       RepoByrDtl.save(updatedEntity);
		return "Submit Successfully";
	}

}
