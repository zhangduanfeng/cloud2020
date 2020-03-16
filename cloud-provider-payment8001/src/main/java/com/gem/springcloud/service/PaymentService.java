package com.gem.springcloud.service;

import com.gem.springcloud.dao.PaymentDao;
import com.gem.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    int create(Payment payment);
    Payment getPaymentById(@Param("id") Long id);
}
