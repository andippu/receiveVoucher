package com.rv.receivevoucher.services;

import com.rv.receivevoucher.models.DetilSalesOrder;
import com.rv.receivevoucher.repository.IDetilSalesOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceDetailOrder {
    @Autowired
    IDetilSalesOrderRepository repoDso;

    public List<DetilSalesOrder> getDetilOrders(String dsoNo){
        return repoDso.getDetilOrder(dsoNo);
    }

}
