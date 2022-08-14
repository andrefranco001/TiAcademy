package br.com.tiacademy.bebidas.service;

import br.com.tiacademy.bebidas.core.crud.CrudService;
import br.com.tiacademy.bebidas.entity.ChaGelado;
import br.com.tiacademy.bebidas.repository.ChaGeladoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChaGeladoService extends CrudService<ChaGelado, Long> {

    @Override
    protected ChaGelado editName(ChaGelado infos, ChaGelado entity) {
        infos.setNome(entity.getNome());
        infos.setData(entity.getData());
        return infos;
    }

    @Autowired
    protected ChaGeladoRepository chaGeladoRepository;

    public ChaGelado findByName(String name) {
        return chaGeladoRepository.findByName(name);
    }
}