
package com.portfrb.rbarros.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    @Id
    private Long id;
    private String nombre;
    private String apellido;
}
