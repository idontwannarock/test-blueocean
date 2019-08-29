package demo.howard.testblueocean.presentation.controller;

import demo.howard.testblueocean.persistence.domain.Board;
import demo.howard.testblueocean.persistence.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class HomeController {

    @Autowired
    private BoardRepository repository;

    @GetMapping
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello World");
    }

    @GetMapping("messages")
    public ResponseEntity<List<Board>> getMessages() {
        return ResponseEntity.ok(repository.findAll());
    }
}
