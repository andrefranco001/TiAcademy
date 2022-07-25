package br.com.tiacademy.bebidas.core.crud;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Objects;

public abstract class CrudService<T, ID> {

    @Autowired
    public CrudRepository<T, ID> repository;

    public List<T> listAll() {
        return repository.findAll();
    }

    public T listById(ID id){
        return repository.findById(id).orElse(null);
    }

    public T save(T entity){
        T isAlcoholic = setIsAlcoholic(entity);
        return repository.save(entity);
    }

    public T editSave(T entity, ID id) {
        T infos = listById(id);

        if (Objects.isNull(infos)) {
            throw new RuntimeException("id não existe");
        }
        else {
            return repository.save(editName(infos, entity));
        }
    }

    public void delete(ID id) {
        repository.deleteById(id);
    }
    protected abstract T editName(T infos, T entity);

    protected abstract T setIsAlcoholic(T entity);
}
