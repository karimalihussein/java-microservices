package com.exmaple.fraud;


import com.example.clients.fraud.FraudCheckResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/fraud-check")
@AllArgsConstructor
public class FraudController {

    private final FraudCheckService fraudCheckService;

    @GetMapping(path = "{customerId}")
    public FraudCheckResponse fraudCheck(@PathVariable("customerId") Integer customerId) {
        return new FraudCheckResponse(fraudCheckService.isFraudster(customerId));
    }
}
