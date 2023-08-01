package Rahim.faridKurs.controller;

import Rahim.faridKurs.entity.Managment;
import Rahim.faridKurs.service.ManagmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/managments")
@RequiredArgsConstructor
public class ManagmentController {
    private final ManagmentService service;
    @GetMapping
    public List<Managment> getAll(){
        return service.getAll();

}
    @GetMapping("/{id}")
    public Managment getById(@PathVariable("id") Integer id) {
        return service.getById(id);
    }
    @GetMapping("/{id}")
    public Managment deleteById(@PathVariable("id") Integer id) {
        return service.getById(id);
    }
}