package org.arslan.retryrecovery.controller;

import lombok.RequiredArgsConstructor;
import org.arslan.retryrecovery.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/retryOrderProcess")
    public String retryOrderProcess() {
        try {
            orderService.processOrder("");
            return "Success";
        } catch (Exception e) {
            return "Failed";
        }
    }

    @GetMapping("/retryOrderProcessWithBackoff")
    public String retryOrderProcessWithBackoff() {
        try {
            orderService.processOrderWithBackoff("");
            return "Success";
        } catch (Exception e) {
            return "Failed";
        }
    }
}
