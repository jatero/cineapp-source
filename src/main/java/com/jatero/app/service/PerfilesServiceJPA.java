package com.jatero.app.service;

import org.springframework.stereotype.Service;
import com.jatero.app.model.Perfil;
import com.jatero.app.repository.PerfilesRepository;

@Service
public class PerfilesServiceJPA implements IPerfilesService {

	private PerfilesRepository perfilesRepo;
	
	public void guardar(Perfil perfil) {
		perfilesRepo.save(perfil);
	}

}
