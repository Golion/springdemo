package com.rwb00.springdemo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping(produces = "application/json")
    public ResponseEntity<List<String>> controllerGet(){
        return new ResponseEntity<>(List.of("this","is","the","get","response"), HttpStatus.OK);
    }

    @PutMapping(produces = "application/json")
    public ResponseEntity<Boolean> controllerPut(){
        return new ResponseEntity<>(Boolean.TRUE, HttpStatus.OK);
    }
}
