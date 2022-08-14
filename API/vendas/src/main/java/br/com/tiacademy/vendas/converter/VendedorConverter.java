package br.com.tiacademy.vendas.converter;

import br.com.tiacademy.vendas.core.crud.CrudConverter;
import br.com.tiacademy.vendas.domain.Vendedor;
import br.com.tiacademy.vendas.dto.VendedorDTO;
import org.springframework.stereotype.Component;

@Component
public class VendedorConverter implements CrudConverter<Vendedor, VendedorDTO> {

    @Override
    public VendedorDTO entidadeParaDto(Vendedor entidade) {
        return new VendedorDTO(entidade.getId(), entidade.getNome());
    }

    @Override
    public Vendedor dtoParaEntidade(VendedorDTO dto) {
        return new Vendedor(dto.getId(), dto.getNome());
    }

}
