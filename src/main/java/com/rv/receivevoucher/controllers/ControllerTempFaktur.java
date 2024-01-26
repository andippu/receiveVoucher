package com.rv.receivevoucher.controllers;

import com.rv.receivevoucher.models.TempFaktur;
import com.rv.receivevoucher.services.ServiceTempFaktur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.io.IOException;
import java.util.List;


@CrossOrigin(origins ={ "https://localhost:4200","https://localhost:9501"}, maxAge = 3600)
@RestController
public class ControllerTempFaktur {
    @Autowired
    ServiceTempFaktur servTFak;

    String result;

    @RequestMapping(value = "/tfak/addtempfak",consumes = {"*/*"})
   // @GetMapping("/tfak/addtempfak")
    public String insTempFaktur ( @RequestBody TempFaktur data) throws IOException {
      //  System.out.println(data.getTFakSpbNo());
       // System.out.println(data.getTFakCustId());
       // System.out.println(data.getTFakPoNo());
      result=servTFak.insTempFaktur(data);
       return result;
    }

    @GetMapping("/tfak/gettfak")
    public List<TempFaktur> gettFalAll (){
        return servTFak.gettFalAll();
    }

    @GetMapping("/tfak/checktempfaktur")
    public String checkTempFaktur() {
        servTFak.checkTempFaktur();
        return "Check and delete Temp Faktur performed";
    }


}
