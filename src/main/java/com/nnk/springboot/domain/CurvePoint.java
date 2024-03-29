package com.nnk.springboot.domain;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "CurvePoint")
@Getter
@Setter
@NoArgsConstructor
public class CurvePoint {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Integer id;

    private Integer curveId;

    private LocalDateTime asOfDate;

    @Min(value = 0, message = "Term must be over 0")
    private double term;

    @Column(name = "curve_value")
    @Min(value = 0, message = "Value must be over 0")
    private double value;

    private LocalDateTime creationDate;

    public CurvePoint(int curveId, double term, double value) {
        this.curveId = curveId;
        this.term = term;
        this.value = value;
    }
}
