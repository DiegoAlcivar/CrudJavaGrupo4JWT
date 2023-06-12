package proyectogrupo4.grupo4.authz.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import proyectogrupo4.grupo4.authz.entity.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {

    List<Role> findAll();

}
