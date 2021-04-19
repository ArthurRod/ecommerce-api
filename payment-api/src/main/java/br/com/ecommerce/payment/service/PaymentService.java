package br.com.ecommerce.payment.service;

import br.com.ecommerce.payment.entity.PaymentEntity;
import br.com.ecommerce.checkout.event.CheckoutCreatedEvent;

import java.util.Optional;

public interface PaymentService {

    Optional<PaymentEntity> create(CheckoutCreatedEvent checkoutCreatedEvent);
}
