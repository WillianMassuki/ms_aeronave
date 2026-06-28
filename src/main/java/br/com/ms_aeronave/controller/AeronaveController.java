package br.com.ms_aeronave.controller;

import br.com.ms_aeronave.model.Aeronave;
import br.com.ms_aeronave.service.AeronaveService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aeronaves")
public class AeronaveController {

    private final AeronaveService service;

    public AeronaveController(AeronaveService service) {
        this.service = service;
    }

    // RF11 + RF12
    @PostMapping
    @Operation

            (summary = "Criar um novo usuário" , description = "Adicionar um novo usuário ao sistema" )
    public Aeronave cadastrar(@RequestBody Aeronave aeronave) {
        return service.cadastrar(aeronave);
    }

    // RF13 + RF14
    /*
    @PutMapping("/associar")
    public Voo associar(@RequestParam Long vooId, @RequestParam Long aeronaveId) {
        return service.associarAeronave(vooId, aeronaveId);
    }

     */
}