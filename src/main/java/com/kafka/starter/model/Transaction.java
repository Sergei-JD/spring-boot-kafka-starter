package com.kafka.starter.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@EqualsAndHashCode
@ToString
public class Transaction {
    private String transactionId;
    private String sender;
    private String receiver;
    private double amount;
    private String description;
    private long timestamp;
}
