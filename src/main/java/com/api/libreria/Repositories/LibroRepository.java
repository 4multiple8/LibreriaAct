
package com.api.libreria.Repositories;

import com.api.libreria.Modelos.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, String> {
}
