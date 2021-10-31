package com.jatero.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jatero.app.model.Detalle;
import com.jatero.app.repository.DetallesRepository;

// Registramos esta clase como un Bean en nuestro Root ApplicationContext.
@Service
public class DetallesServiceJPA implements IDetallesService{

	// Inyectamos una instancia desde nuestro Root ApplicationContext.
    @Autowired
	private DetallesRepository detallesRepo;
		
	
	public void insertar(Detalle detalle) {
		detallesRepo.save(detalle);
	}

	
	public void eliminar(int idDetalle) {
		// detallesRepo.delete(idDetalle); // Spring 4.3
		detallesRepo.deleteById(idDetalle);
	}

}
