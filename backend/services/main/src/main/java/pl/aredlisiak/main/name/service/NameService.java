package pl.aredlisiak.main.name.service;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@Getter
public class NameService {
    private final String name = "MAIN SERVICE";
}
