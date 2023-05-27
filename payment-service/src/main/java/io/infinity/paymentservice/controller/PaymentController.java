package io.infinity.paymentservice.controller;

import io.infinity.paymentservice.dto.PaymentResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @GetMapping("/")
    public String greet() {
        return "Welcome to Payment Service";
    }

    @GetMapping("/{transactionId}")
    public ResponseEntity<PaymentResponse> details(@PathVariable("transactionId") String transactionId) {
        return ResponseEntity.ok(new PaymentResponse(transactionId, "ABC_123", 100.00));
    }
}
