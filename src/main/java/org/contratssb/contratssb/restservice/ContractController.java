package org.contratssb.contratssb.restservice;
import java.util.concurrent.atomic.AtomicLong;

import org.contratssb.contratssb.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContractController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
    @GetMapping("/contracts")
    public String string(){
        return "tous les contrats";
    }
    @GetMapping("/contract/{id}")
    public String contract(@PathVariable int id){
        return String.format("Contrat numéro : %d", id);
    }
}
