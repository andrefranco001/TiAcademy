package br.com.tiacademy.bebidas.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ChaGeladoDtoRequest {
    private String nome;
    private String data;
}
