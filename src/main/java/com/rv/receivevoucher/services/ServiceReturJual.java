package com.rv.receivevoucher.services;

import com.rv.receivevoucher.models.ReturJual;
import com.rv.receivevoucher.repository.IReturJual;
import com.rv.receivevoucher.repository.IReturJualDetail;
import jakarta.ws.rs.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceReturJual {
    @Autowired
    IReturJual reportjl;

    public List<ReturJual> getReturJualList (String dt){
      return  reportjl.getRetJualDate(dt);
    }
    
    public Optional<ReturJual> getReturJualById(String id){
    	return reportjl.findById(id);
    }
    
    public String saveUpdateReturJual(ReturJual dt) {
    	reportjl.save(dt);
    	return "Submit Successfully";
    }


}
