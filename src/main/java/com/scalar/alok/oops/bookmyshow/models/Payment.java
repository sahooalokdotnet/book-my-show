package com.scalar.alok.oops.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Payment extends BaseModel{
    private int amount;

    @Enumerated(EnumType.ORDINAL)
    private PaymentStatus status;

    @Enumerated(EnumType.ORDINAL)
    private PaymentMode mode;
    //it will be provided by the payment handler
    //it will help for refund process
    private String referenceId;
}
