package dev.iluck.CadastroDeNinjas.Models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@Table(name = "tb_missoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MissaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String nome;

    private String dificuldade;

    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;
}
