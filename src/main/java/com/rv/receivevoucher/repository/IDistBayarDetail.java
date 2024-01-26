package com.rv.receivevoucher.repository;

import com.rv.receivevoucher.models.DistBayarDetail;
import com.rv.receivevoucher.models.DistBayarMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.data.jpa.repository.Query;

import java.math.BigInteger;
import java.util.List;

@Repository
public interface IDistBayarDetail extends JpaRepository <DistBayarDetail, Long> {
	
	List<DistBayarDetail> findByDydMbdNo (String mbdNo);
	

}
