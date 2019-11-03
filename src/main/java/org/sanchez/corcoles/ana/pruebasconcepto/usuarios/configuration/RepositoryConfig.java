package org.sanchez.corcoles.ana.pruebasconcepto.usuarios.configuration;

import org.sanchez.corcoles.ana.pruebasconcepto.usuarios.model.entity.Rol;
import org.sanchez.corcoles.ana.pruebasconcepto.usuarios.model.entity.Usuario;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {

    //Para que muestre los Ids cuando obtenemos las entidades mediante llamada HTTP
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Usuario.class, Rol.class);
    }
}
