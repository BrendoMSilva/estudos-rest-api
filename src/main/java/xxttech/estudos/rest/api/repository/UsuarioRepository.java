package xxttech.estudos.rest.api.repository;

import org.springframework.data.repository.CrudRepository;
import xxttech.estudos.rest.api.model.UsuarioModel;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer> {
}
