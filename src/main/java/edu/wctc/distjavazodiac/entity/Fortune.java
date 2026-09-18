package edu.wctc.distjavazodiac.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "fortune")
@Data
@NoArgsConstructor
public class Fortune {

    @Id
    @Column(name = "fortune_id")
    private int id;

    @Column(name = "text")
    private String text;
}
