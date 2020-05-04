package pl.aredlisiak.secondary.name.service;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@Getter
public class NameService {
    private final String name = "SECONDARY SERVICE";
}
