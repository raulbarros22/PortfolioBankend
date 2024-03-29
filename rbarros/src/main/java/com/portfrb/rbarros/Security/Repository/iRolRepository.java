package com.portfrb.rbarros.Security.Repository;

import com.portfrb.rbarros.Security.Entity.Rol;
import com.portfrb.rbarros.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
