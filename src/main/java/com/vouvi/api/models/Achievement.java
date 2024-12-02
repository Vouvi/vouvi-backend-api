package com.vouvi.api.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "tb_achievement")
public class Achievement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_achievement")
    private Long idAchievement;

    @Column(name = "name_achievement", nullable = false)
    private String nameAchievement;

    @Column(name = "describe_achievement", nullable = false)
    private String describeAchievement;
    
}
