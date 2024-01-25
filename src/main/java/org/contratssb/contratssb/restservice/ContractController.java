package org.contratssb.contratssb.restservice;
import java.util.concurrent.atomic.AtomicLong;

import org.contratssb.contratssb.Greeting;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/contract")
    public String createContract(@RequestBody Contract contract) {
        // Logique pour créer un contrat avec les données passées dans le body de la requête.
        return "Contrat créé avec succès";}
    @PutMapping("/contract/{id}")
    public String updateContract(@PathVariable int id, @RequestBody /*dtoRequestContract dto*/) {
        // Appel de la méthode de la bll.
        return "Contrat mis à jour avec succès";}
    @DeleteMapping("/contract/{id}")
    public String deleteContract(@PathVariable int id) {
        //Appel de la méthode delete de la bll
        return "Contrat supprimé avec succès";
    }
}
