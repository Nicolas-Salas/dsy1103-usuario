package cl.duoc.clase.usuario.api.usuarios;

import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    public UsuarioDTO get(){
        UsuarioDTO usuario = new UsuarioDTO();
        usuario.setNombre("Nicolas");
        return usuario;
    }
}
