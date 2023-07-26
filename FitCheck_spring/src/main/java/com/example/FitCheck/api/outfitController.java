package com.example.FitCheck.api;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/") 
public class outfitController {
    
    @GetMapping("/idk") 
    public String getOutfit(String outfit) {
        return "Hi";
    }
    
    @PostMapping("/outfit")
    public void addOutfit(String name) {
        return;
    }

    @PutMapping("/outfit/update") 
    public void updateOutfit(String newOuftit, String oldOutfit) {
        return;
    }

    @DeleteMapping
    public void removeOutfit(String outfti) {
        return;
    }


}
