package org.sanchez.corcoles.ana.pruebasconcepto.usuarios.model.dao;

import org.sanchez.corcoles.ana.pruebasconcepto.usuarios.commons.model.entity.Usuario;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

//Usamos la anotación RepositoryRestResource para que genere el CRUD automáticamente. Con path indicamos el endpoint que se va a utilizar para el CRUD
@RepositoryRestResource(path = "usuarios")
//PagingAndSortingRepository<nombre_de_la_clase, clave_de_la_entidad>
public interface UsuarioDao extends PagingAndSortingRepository<Usuario, Long> {

    //También podríamos hacerlo así --> @Query("select u from Usuario u where u.userName=?1") e lugar de con palabras clave. ?1 corresponde al primer atributo de la firma del método.
    //@RestResource(path = "usuarios") //Se utiliza para renombrar el endpoint, por defecto sería /usuarios/search/findByUserName?userName=corcoles155
    Usuario findByUserName(@Param("username") String userName);

}
