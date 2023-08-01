package Rahim.faridKurs.controller;

import Rahim.faridKurs.dto.HotelPageResponse;
import Rahim.faridKurs.entity.Hotel;
import Rahim.faridKurs.service.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hotel")
@RequiredArgsConstructor

public class HotelController {
    private final HotelService service;
    @GetMapping
    public HotelPageResponse getAll(@RequestParam("page") Integer page,
                                    @RequestParam("count") Integer count) {

        return service.getAll(page, count);

}
    @GetMapping("/{id}")
    public ResponseEntity<Hotel> getById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(service.getById(id));
    }
    @GetMapping("/kabnet/{kabnetId}")
    public HotelPageResponse getAll(
            @PathVariable("kabnetId") Integer kabnetId,
            @RequestParam("page") Integer page,
            @RequestParam("count") Integer count) {

        return service.getByKabnetId(kabnetId,page, count);
    }

}
