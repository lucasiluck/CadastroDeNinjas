package dev.iluck.CadastroDeNinjas.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Aqui monto minhas rotas
@RestController
@RequestMapping
public class Controller {

    @GetMapping("/boasvindas")
     public String boasVindas(){
         return "Essa é minha primeira mensagem nessa rota";
     }

}
