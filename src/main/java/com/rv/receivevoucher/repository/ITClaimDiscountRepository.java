package com.rv.receivevoucher.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.rv.receivevoucher.models.TClaimDiscount;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Repository
public interface ITClaimDiscountRepository extends JpaRepository<TClaimDiscount, String> {
	@Procedure(procedureName = "CLAIM_DISCT_GET_DATA")
	public String runProClaimDisc(String P_DIST, String P_DATE);
}
