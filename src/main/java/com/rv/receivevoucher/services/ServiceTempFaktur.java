package com.rv.receivevoucher.services;

import com.rv.receivevoucher.models.TempFaktur;
import com.rv.receivevoucher.repository.ITempFakturRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ServiceTempFaktur {
    @Autowired
    ITempFakturRepository repoTempFak;

    public String insTempFaktur (TempFaktur data){
        repoTempFak.save(data);
       return "Suksesss";
    }

    public List<TempFaktur> gettFalAll (){
        return repoTempFak.getTFakAll();
    }

    public void checkTempFaktur() {
        List<TempFaktur> tfak = repoTempFak.findAll(); // You can use findBy<YourField> if needed

        if (!tfak.isEmpty()) {

            repoTempFak.deleteAll();
            System.out.println("Data deleted successfully");
        } else {
            System.out.println("No data found in the table");
        }
    }

}
