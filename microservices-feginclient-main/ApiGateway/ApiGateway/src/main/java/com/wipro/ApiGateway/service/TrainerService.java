package com.wipro.ApiGateway.service;



import com.wipro.ApiGateway.model.Trainer;
import org.springframework.stereotype.Service;

@Service
public class TrainerService {

    public Trainer getTrainerForBatch(String batch) {
        Trainer trainer = new Trainer();
        trainer.setName("John Doe");
        trainer.setBatch(batch);
        trainer.setExpertise("Java");
        return trainer;
    }
}
