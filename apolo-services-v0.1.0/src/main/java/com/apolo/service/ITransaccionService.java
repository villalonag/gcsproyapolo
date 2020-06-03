package com.apolo.service;

import java.util.List;
import com.apolo.model.Transaccion;


public interface ITransaccionService  {
	
    List<Transaccion>list();
    Transaccion listarId(int id);
    Transaccion add(Transaccion p);
    Transaccion edit(Transaccion p);
    Transaccion delete(int id);

		
}
