package com.vineet.Sayari_app.controller;
import com.vineet.Sayari_app.Service.GPT3Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/gpt3")
public class GPT3Controller {

    private final GPT3Service gpt3Service;

    public GPT3Controller(GPT3Service gpt3Service) {
        this.gpt3Service = gpt3Service;
    }

    @PostMapping("/generate")
    public String generateText(@RequestBody String inputText) {
        return gpt3Service.generateText(inputText);
    }
}