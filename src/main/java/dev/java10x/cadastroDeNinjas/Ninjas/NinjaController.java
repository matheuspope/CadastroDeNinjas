package dev.java10x.cadastroDeNinjas.Ninjas;


import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping // Request mapping mapeia a rota onde eu quero chegar
public class NinjaController {


    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Essa é a minha primeira mensagem nessa rota";
    }

    //Create Read Update Delete CRUD


    // Adicionar ninja (CREATE)

    @PostMapping("/adicionar")
    public String criarNinja(){
        return "Ninja Criado";
    }

    // Mostrar todos os ninjas (READ)
    @GetMapping("/ninjas")
        public String mostrarTodoOsNinjas(){
        return "Mostrar todos os Ninjas ";
    }

    // Mostrar ninja por id (READ)

    @GetMapping("/ninjasID")
    public String mostrarTodoOsNinjasPorId(){
        return "Mostrar Ninja por id";
    }

    // Alterar dados dos ninjas (UPDATE)
    @PutMapping("/alterarID")
    public String alterarNinjaPorId(){
        return  "Alterar Ninja por id";
    }

    // Deletar Ninja (DELETE)
    @DeleteMapping("/deletarId")
    public  String deletarNinjaPorId(){
        return "NInja deletado pro ID";

    }
}
