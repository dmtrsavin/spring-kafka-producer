package ru.savin.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.savin.model.FoodOrder;
import ru.savin.producer.Producer;

@Slf4j
@Service
@RequiredArgsConstructor
public class FoodOrderService {
    private final Producer producer;

    public String createFoodOrder(FoodOrder foodOrder) {
        try {
            return producer.sendMessage(foodOrder);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
