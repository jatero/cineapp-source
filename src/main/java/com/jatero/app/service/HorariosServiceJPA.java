package com.jatero.app.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.jatero.app.model.Horario;
import com.jatero.app.repository.HorariosRepository;

// Registramos esta clase como un Bean en nuestro Root ApplicationContext.
@Service
public class HorariosServiceJPA implements IHorariosService{
	
	// Inyectamos una instancia desde nuestro Root ApplicationContext.
    @Autowired
	private HorariosRepository horariosRepo;
	
	
	public List<Horario> buscarPorIdPelicula(int idPelicula, Date fecha) {
		return horariosRepo.findByPelicula_IdAndFechaOrderByHora(idPelicula,fecha);		
	} 

	
	public void insertar(Horario horario) {
		horariosRepo.save(horario);
	}

	
	public List<Horario> buscarTodos() {
		return horariosRepo.findAll();
	}
	
	
	public Page<Horario> buscarTodos(Pageable page) {
		return horariosRepo.findAll(page);
	}

	
	public void eliminar(int idHorario) {
		// horariosRepo.delete(idHorario); // Spring 4.3		
		horariosRepo.deleteById(idHorario);
	}

	
	public Horario buscarPorId(int idHorario) {
		Optional<Horario> optional = horariosRepo.findById(idHorario);
		if (optional.isPresent())
			return optional.get();
		return null;
	}
}
