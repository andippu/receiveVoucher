package com.rv.receivevoucher.repository;

import com.rv.receivevoucher.models.FakturMaster;
import com.rv.receivevoucher.models.VFakturMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Date;
import java.util.List;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IFakturMasterRepository extends JpaRepository<FakturMaster,String> {
    @Query(value = "select s from FakturMaster s where s.fmNo=?1 ")
    public List<FakturMaster> getFakturByNoFaktur(String fmNo);
    
    public List<FakturMaster> findByFmLunas (String status);
    
	@Procedure(procedureName = "HIT_DSO")
	public String runHitungUlangFaktur(String P_FKT, String P_FKT2);
	
	@Procedure(procedureName = "P_DELETE_FAKTUR_MASTER")
	public String deleteFakturMaster(String p_fmno);
	
	@Procedure(procedureName = "P_CHECK_LUNAS_MASTER")
	public String pelunasanFakturMaster(String p_fmno, String p_type);
	
	//closing monthly
	
	@Procedure(procedureName = "GET_EXCEL_LAP_PIUTANG")
	String runLapPiutangExcel(String bulan);
	

}
