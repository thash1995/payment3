package com.paf.springboot.dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.paf.springboot.model.Payment;
import com.paf.springboot.repository.PaymentRepository;

@Service
public class PaymentDAO {
	@Autowired
	PaymentRepository paymentRepository;
	
	/*SAVE AN PAYMENT*/
	@Transactional(readOnly = false,isolation = Isolation.READ_COMMITTED)
	public Payment save(Payment pay) {
		return paymentRepository.save(pay);
	}
	
	
	
    /*SEARCH ALL PAYMENT*/
	public List<Payment> findAll(){
		return paymentRepository.findAll();
		
	}
	
	
	/* GET AN PAYMENT*/
	public Payment findOne(Long  pid) {
		return paymentRepository.findOne(pid);
	}
	
	/*DELETE AN PAYMENT*/
	public void delete(Payment pay) {
		paymentRepository.delete(pay);
		}
}
