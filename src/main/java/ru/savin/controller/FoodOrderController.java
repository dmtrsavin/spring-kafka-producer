package ru.savin.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.savin.model.FoodOrder;
import ru.savin.service.FoodOrderService;

@Slf4j
@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class FoodOrderController {
    private final FoodOrderService foodOrderService;

    @PostMapping
    public String createFoodOrder(@RequestBody FoodOrder foodOrder) {
        return foodOrderService.createFoodOrder(foodOrder);
    }
}
