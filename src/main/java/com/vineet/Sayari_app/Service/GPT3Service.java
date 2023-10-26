package com.vineet.Sayari_app.Service;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GPT3Service {

    private final String apiKey = "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"; // Replace with your actual API key
    private final String apiEndpoint = "https://api.openai.com/v1/engines/davinci-codex/completions"; // Replace with the actual endpoint URL

    private final RestTemplate restTemplate;

    public GPT3Service() {
        this.restTemplate = new RestTemplate();
    }

    public String generateText(String inputText) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + apiKey);

        HttpEntity<String> requestEntity = new HttpEntity<>(inputText, headers);

        ResponseEntity<String> responseEntity = restTemplate.exchange(
                apiEndpoint,
                HttpMethod.POST,
                requestEntity,
                String.class
        );

        return responseEntity.getBody();
    }
}
