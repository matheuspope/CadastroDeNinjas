package dev.java10x.cadastroDeNinjas.Ninjas;


import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/ninjas") // Request mapping mapeia a rota onde eu quero chegar
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Essa é a minha primeira mensagem nessa rota";
    }

    //Create Read Update Delete CRUD

    // Adicionar ninja (CREATE)

    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja Criado";
    }

    // Mostrar todos os ninjas (READ)
    @GetMapping("/listar")
        public List<NinjaModel> mostrarTodoOsNinjas() {
        return ninjaService.listarNinjas();
    }

    // Mostrar ninja por id (READ)

    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjasPorId(@PathVariable Long id){
        return ninjaService.listarNinjasPorId(id);
    }

    // Alterar dados dos ninjas (UPDATE)

    @PutMapping("/alterarID")
    public String alterarNinjaPorId(){
        return  "Alterar Ninja por id";
    }

    // Deletar Ninja (DELETE)

    @DeleteMapping("/deletarId")
    public String deletarNinjaPorId(){
        return "NInja deletado pro ID";

    }
}
