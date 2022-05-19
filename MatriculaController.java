package me.dio.academia.digital.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {
}

@Autowired
private MatriculaServiceImpl service;

@PostMapping
public Matricula create(@Valid @Requestbody MatriculaForm form) {return service.create(form);}

@GetMapping
public List<Matricula> getAll(@RequestParam("bairro", required = false) String bairro) {return service.getAll(bairro);}
