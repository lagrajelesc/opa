package com.opa.assesment.opaassesment.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "Exercise2Model")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Exercise2Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String firstLimit;

    @Column
    private String secondLimit;

    @Column
    private String results;

    @Column
    private LocalDateTime date;

}
