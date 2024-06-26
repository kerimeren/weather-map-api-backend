package com.example.weathermapapi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import javax.persistence.*;

@Data
@Entity
@Table(name = "pollutions")
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Pollution
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_city")
    private City city;

    @Column(name = "date")
    private LocalDate date;

    @Column (name = "co")
    private float co;

    @Column (name = "so2")
    private float so2;

    @Column (name = "o3")
    private float o3;
}

