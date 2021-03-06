package com.sbank.spring.repository;

import com.sbank.spring.entity.Account;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long>{
    boolean existsByAccountNumber(String accountNumber); //계좌번호 중복검사
    Account findByAccountNumber(String accountNumber); //계좌번호로 사용자 조회
}
