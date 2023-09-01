package Rahim.faridKurs.controller;

import Rahim.faridKurs.entity.Kabnet;
import Rahim.faridKurs.service.KabnetService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/kabnet")
@RequiredArgsConstructor
public class KabnetController {
    private final KabnetService service;
    @GetMapping
    public List<Kabnet> getAll(){
        return service.getAll();
}}


