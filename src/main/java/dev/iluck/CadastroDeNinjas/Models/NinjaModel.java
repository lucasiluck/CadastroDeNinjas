package dev.iluck.CadastroDeNinjas.Models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @Column(unique = true)
    private String email;
    private int idade;

    @ManyToOne
    @JoinColumn( name ="missoes_id")
    private MissaoModel missoes;
}
