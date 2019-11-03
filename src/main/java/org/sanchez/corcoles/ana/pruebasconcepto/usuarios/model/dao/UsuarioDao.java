package org.sanchez.corcoles.ana.pruebasconcepto.usuarios.model.dao;

import org.sanchez.corcoles.ana.pruebasconcepto.usuarios.model.entity.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//Usamos la anotación RepositoryRestResource para que genere el CRUD automáticamente. Con path indicamos el endpoint que se va a utilizar para el CRUD
@RepositoryRestResource(path = "usuarios")
//PagingAndSortingRepository<nombre_de_la_clase, clave_de_la_entidad>
public interface UsuarioDao extends PagingAndSortingRepository<Usuario, Long> {

    //También podríamos hacerlo así --> @Query("select u from Usuario u where u.userName=?1") e lugar de con palabras clave. ?1 corresponde al primer atributo de la firma del método.
    Usuario findByUserName(String userName);

}
