package br.com.tiacademy.bebidas.service;

import br.com.tiacademy.bebidas.core.crud.CrudService;
import br.com.tiacademy.bebidas.entity.Fermentado;
import br.com.tiacademy.bebidas.repository.FermentadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FermentadoService extends CrudService<Fermentado, Long> {
    @Override
    protected Fermentado editName(Fermentado infos, Fermentado entity) {
        infos.setNome(entity.getNome());
        infos.setData(entity.getData());
        return infos;
    }

    @Autowired
    protected FermentadoRepository fermentadoRepository;

    public Fermentado findByName(String name) {
        return fermentadoRepository.findByName(name);
    }
}