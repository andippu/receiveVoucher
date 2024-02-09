package com.rv.receivevoucher.services;



import com.rv.receivevoucher.models.ReturJual;
import com.rv.receivevoucher.repository.IReturJual;
import com.rv.receivevoucher.repository.IReturJualDetail;
import jakarta.ws.rs.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;


import java.util.List;


@Service
public class ServiceReturJual {
    @Autowired
    IReturJual reportjl;

    public List<ReturJual> getReturJualList (String dt){
      return  reportjl.getRetJualDate(dt);
    }
    
    public List<ReturJual> getReturJualAll(){
    	return reportjl.findAll();
    }


}
