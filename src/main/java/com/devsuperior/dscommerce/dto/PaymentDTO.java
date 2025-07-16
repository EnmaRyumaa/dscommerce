package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.Payment;

import java.time.Instant;

public class PaymentDTO {

    private Long id;
    private Instant moment;

    public PaymentDTO(Instant moment, Long id) {
        this.moment = moment;
        this.id = id;
    }

    public PaymentDTO(Payment pay) {
        this.id = pay.getId();
        this.moment = pay.getMoment();
    }

    public Long getId() {
        return id;
    }

    public Instant getMoment() {
        return moment;
    }
}
