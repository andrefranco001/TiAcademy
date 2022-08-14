package br.com.tiacademy.bebidas.core.crud;

import br.com.tiacademy.bebidas.entity.Distribuidora;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Objects;

public abstract class CrudService<T, ID> {

    @Autowired
    public CrudRepository<T, ID> repository;

    public List<T> findAll() {
        return repository.findAll();
    }

    public T findById(ID id){
        return repository.findById(id).orElse(null);
    }

    public T save(T entity){
        return repository.save(entity);
    }

    public T editSave(T entity, ID id) {
        T infos = findById(id);

        if (Objects.isNull(infos)) {
            throw new RuntimeException("id não existe");
        }
        else {
            return repository.save(editName(infos, entity));
        }
    }

    public void deleteById(ID id) {
        repository.deleteById(id);
    }
    protected abstract T editName(T infos, T entity);

}
