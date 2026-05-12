package com.luccasmesquita.CadastroDeNinjas.Ninjas;

import com.luccasmesquita.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//JPA(dependencia) = Java Persistence API
@Entity //transforma uma classe em entidade do DB
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    //@ManyToOne - um ninja tem uma unica missao
    @ManyToOne
    @JoinColumn(name = "missoes_id") // foreing key - chave estrangeira
    private MissoesModel missoes;

}
