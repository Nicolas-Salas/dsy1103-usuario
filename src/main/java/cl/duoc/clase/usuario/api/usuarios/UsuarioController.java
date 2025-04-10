package cl.duoc.clase.usuario.api.usuarios;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/usuarios")
public class UsuarioController {

    public final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<UsuarioDTO> get() {
        UsuarioDTO usuario = new UsuarioDTO();
        usuario.setNombre("Nicolas");
        return ResponseEntity.ok(usuario);
    }
}
