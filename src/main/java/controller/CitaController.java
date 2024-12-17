/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.Cita;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.CitaRepository;

@RestController
@RequestMapping("/citas")
public class CitaController {

    @Autowired
    private CitaRepository citaRepository;

    @PostMapping("/agendar")
    public Cita agendarCita(@RequestBody Cita cita) {
        return citaRepository.save(cita);
    }

    @GetMapping
    public Iterable<Cita> listarCitas() {
        return citaRepository.findAll();
    }
}