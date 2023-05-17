package com.exmaple.fraud;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "fraud_check_history")
public class FraudCheckHistory {
    @Id
    @SequenceGenerator(name = "fraud_id_sequence", sequenceName = "fraud_id_sequence", allocationSize = 1)
    @GeneratedValue(generator = "fraud_id_sequence")
    private Long id;
    private Integer customerId;
    private Boolean isFaraudster;
    private LocalDateTime createdAt;
}
