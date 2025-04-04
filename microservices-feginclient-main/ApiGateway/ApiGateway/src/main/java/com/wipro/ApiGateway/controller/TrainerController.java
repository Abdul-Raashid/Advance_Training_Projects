package com.wipro.ApiGateway.controller;


import com.wipro.ApiGateway.model.Trainer;
import com.wipro.ApiGateway.service.TrainerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainerController {

    private final TrainerService trainerService;

    public TrainerController(TrainerService trainerService) {
        this.trainerService = trainerService;
    }

    @GetMapping("/trainer/{batch}")
    public Trainer getTrainer(@PathVariable String batch) {
        return trainerService.getTrainerForBatch(batch);
    }
}

