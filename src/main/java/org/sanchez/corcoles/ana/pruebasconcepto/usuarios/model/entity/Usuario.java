package org.sanchez.corcoles.ana.pruebasconcepto.usuarios.model.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name", unique = true, length = 20)
    private String userName;

    @Column(length = 60)
    private String nombre;

    private String apellido;

    private Boolean enabled;

    @Column(unique = true, length = 100)
    private String email;

    /*
     * Se utiliza fetch para indicar la forma de obtener los datos, hay dos tipos:
     * LAZY, al realizar la consulta únicamente obtiene el usuario
     * EAGER, al realizar la consulta obtendrá el usuario + roles
     */
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Rol> roles;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Rol> getRoles() {
        return roles;
    }

    public void setRoles(List<Rol> roles) {
        this.roles = roles;
    }
}
