package com.devsuperior.dslist1.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "tb_game")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private Integer ano;
    private String genero;
    private String plataforma;
    private Double pontuacao;
    private String imgUrl;

    @Column(name = "descricaoreduzida", columnDefinition = "TEXT")
    private String descricaoReduzida;

    @Column(name = "descricaocompleta", columnDefinition = "TEXT")
    private String descricaoCompleta;


}
