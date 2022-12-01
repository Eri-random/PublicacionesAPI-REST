package com.api.rest.publicaciones.repositorios;

import com.api.rest.publicaciones.entidades.Publicacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicacionRepository extends JpaRepository<Publicacion, Long> {
}
