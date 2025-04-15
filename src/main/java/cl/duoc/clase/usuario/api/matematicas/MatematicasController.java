package cl.duoc.clase.usuario.api.matematicas;

import org.springframework.boot.SpringApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
@RequestMapping

public class MatematicasController {


    @GetMapping("/api/suma/{num1}/{num2}")
    public ResponseEntity<Integer> suma(
        @PathVariable("num1") int numero1, 
        @PathVariable("num2") int numero2) {
            return new ResponseEntity<>( numero1 + numero2, HttpStatus.OK);
    }

    @GetMapping("/api/resta/{num1}/{num2}")
    public ResponseEntity<Integer> resta(
        @PathVariable("num1") int numero1, 
        @PathVariable("num2") int numero2) {
            return new ResponseEntity<>( numero1 - numero2, HttpStatus.OK);
    }

    @GetMapping("/api/multiplicacion/{num1}/{num2}")
    public ResponseEntity<Integer> multiplicacion(
        @PathVariable("num1") int numero1, 
        @PathVariable("num2") int numero2) {
            return new ResponseEntity<>( numero1 * numero2, HttpStatus.OK);
    }

    @GetMapping("/api/division/{num1}/{num2}")
    public ResponseEntity<Integer> division(
        @PathVariable("num1") int numero1, 
        @PathVariable("num2") int numero2) {
            return new ResponseEntity<>(numero1 / numero2, HttpStatus.OK);
        }
}