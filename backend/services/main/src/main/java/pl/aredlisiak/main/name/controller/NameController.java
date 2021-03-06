package pl.aredlisiak.main.name.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.aredlisiak.main.name.service.NameService;

@RestController
@RequestMapping(value = "name")
@RequiredArgsConstructor
public class NameController {
    private final NameService nameService;

    @GetMapping
    public String getName() {
        return nameService.getName();
    }
}
