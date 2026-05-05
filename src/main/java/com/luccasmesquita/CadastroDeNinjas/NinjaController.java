package com.luccasmesquita.CadastroDeNinjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //falando pro java que esse arquivo é um controller
@RequestMapping //mapeando rotas
public class NinjaController {
    //controller vai mapear esse arquivo do java

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Essa é minha primeisa mensagem nessa rota";
    }

}
