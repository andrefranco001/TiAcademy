package br.com.tiacademy.bebidas.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Suco {
    private final static String ALCOOLICO = "Não";
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String alcoolico = ALCOOLICO;
    private String data;

    @ManyToOne
    @JoinColumn(name = "distribuidora_id", referencedColumnName = "id")
    private Distribuidora distribuidora;
}
