package com.ai.gemini;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@AllArgsConstructor
@RequestMapping("/api/qna")
public class AIController {

    private final QnAService qnAService;

    @GetMapping("/ask")
    public ResponseEntity<String> askQuestion(@RequestParam String question) {
        String answer = qnAService.getAnswer(question);
        return ResponseEntity.ok(answer);
    }
}
