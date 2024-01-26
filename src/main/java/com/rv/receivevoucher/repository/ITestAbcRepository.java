package com.rv.receivevoucher.repository;

import com.rv.receivevoucher.models.TestAbc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin("http://localhost:4200")
public interface ITestAbcRepository extends JpaRepository<TestAbc,String> {
}
