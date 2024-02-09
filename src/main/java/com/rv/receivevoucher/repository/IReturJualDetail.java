package com.rv.receivevoucher.repository;

import com.rv.receivevoucher.models.ReturJualDetail;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IReturJualDetail extends JpaRepository <ReturJualDetail,String> {
	
	List<ReturJualDetail> findByRjdNo(String id);
	
	Optional<ReturJualDetail> findByRjdFmNo(String id);
	
}
