package dev.franzon.aws;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloResource {

    @GetMapping
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("Hello AWS!");
    }
}
