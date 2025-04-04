package com.example.Training.Controller;

import com.example.Training.Entity.Training;
import com.example.Training.Service.TrainingService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/trainings")
public class TrainingController {
    private final TrainingService trainingService;

    public TrainingController(TrainingService trainingService) {
        this.trainingService = trainingService;
    }

    // ✅ Get all trainings
    @GetMapping("/all")
    public List<Training> getAllTrainings() {
        return trainingService.getAllTrainings();
    }

    // ✅ Get training by ID
    @GetMapping("/{id}")
    public Training getTrainingById(@PathVariable Long id) {
        return trainingService.getTrainingById(id);
    }

    // ✅ Add a new training
    @PostMapping("/add")
    public Training addTraining(@RequestBody Training training) {
        return trainingService.addTraining(training);
    }

    // ✅ Update an existing training
    @PutMapping("/{id}")
    public Training updateTraining(@PathVariable Long id, @RequestBody Training updatedTraining) {
        return trainingService.updateTraining(id, updatedTraining);
    }

    // ✅ Delete a training by ID
    @DeleteMapping("/{id}")
    public String deleteTraining(@PathVariable Long id) {
        trainingService.deleteTraining(id);
        return "Training with ID " + id + " deleted successfully!";
    }

    // ✅ Get all ongoing trainings
    @GetMapping("/ongoing")
    public List<Training> getOngoingTrainings() {
        return trainingService.getOngoingTrainings();
    }

    // ✅ Get trainings by skill (Example: Java)
    @GetMapping("/by-skill")
    public List<Training> getTrainingsBySkill(@RequestParam String skill) {
        return trainingService.getTrainingsBySkill(skill);
    }

    // ✅ Get trainings between start and end dates
    @GetMapping("/by-dates")
    public List<Training> getTrainingsBetweenDates(@RequestParam LocalDate startDate, @RequestParam LocalDate endDate) {
        return trainingService.getTrainingsBetweenDates(startDate, endDate);
    }

    // ✅ Get trainings by status
    @GetMapping("/by-status")
    public List<Training> getTrainingsByStatus(@RequestParam Training.TrainingStatus status) {
        return trainingService.getTrainingsByStatus(status);
    }
}
