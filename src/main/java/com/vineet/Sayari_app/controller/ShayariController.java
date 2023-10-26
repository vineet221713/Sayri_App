//package com.vineet.Sayari_app.controller;
//import org.springframework.ui.Model;
//import org.springframework.stereotype.Controller;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.client.RestTemplate;
//
//@Controller
//public class ShayariController {
//
//    @Value("${openai.api-key}")
//    private String openaiApiKey;
//
//    @GetMapping("/generate-shayari")
//    public String generateShayari(Model model) {
//        // Call OpenAI API to generate Shayari
//        String generatedShayari = generateShayariUsingOpenAI();
//        model.addAttribute("shayari", generatedShayari);
//        return "shayari";
//    }
//
//    private String generateShayariUsingOpenAI() {
//        String prompt = "Generate a Shayari about spring";
//        String apiUrl = "https://api.openai.com/v1/engines/davinci/completions";
//
//        // You may need to adjust this request depending on the OpenAI API version
//        String requestBody = "{\"prompt\": \"" + prompt + "\", \"max_tokens\": 50}";
//
//        RestTemplate restTemplate = new RestTemplate();
//        String generatedShayari = restTemplate.postForObject(apiUrl, requestBody, String.class);
//
//        return generatedShayari;
//    }
//}
