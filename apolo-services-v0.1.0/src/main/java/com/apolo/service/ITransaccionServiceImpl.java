package com.apolo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.apolo.model.Transaccion;
import com.apolo.repo.ITransaccionRepo;



@Service
public class ITransaccionServiceImpl implements ITransaccionService{
	
	@Autowired
	private ITransaccionRepo repo;

	@Override
	public List<Transaccion> list() {
		return repo.findAll();
	}

	@Override
	public Transaccion add(Transaccion t) {
		return repo.save(t);
	}

	@Override
	public Transaccion edit(Transaccion t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Transaccion listarId(int idtrx) {
		return repo.findByIdtrx(idtrx);
	}

	@Override
	public Transaccion delete(int idtrx) {
		Transaccion t=repo.findByIdtrx(idtrx);
        if(t!=null){
            repo.delete(t);
        }
       return t;
	}




}
