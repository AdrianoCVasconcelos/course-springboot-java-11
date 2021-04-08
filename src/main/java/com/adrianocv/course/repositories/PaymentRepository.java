package com.adrianocv.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adrianocv.course.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
