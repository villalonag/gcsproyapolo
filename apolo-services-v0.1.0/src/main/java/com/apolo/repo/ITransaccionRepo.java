package com.apolo.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.apolo.model.Transaccion;

public interface ITransaccionRepo extends CrudRepository<Transaccion, Integer> {

    List<Transaccion>findAll();
    Transaccion save(Transaccion p);
    Transaccion findByIdtrx(int idtrx);
    void delete(Transaccion p);

}
