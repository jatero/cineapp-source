package com.jatero.app.service;

import com.jatero.app.model.Detalle;

public interface IDetallesService {
	void insertar(Detalle detalle);
	void eliminar(int idDetalle);
}
