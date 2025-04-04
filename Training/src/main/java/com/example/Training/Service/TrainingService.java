package com.example.Training.Service;

import com.example.Training.Entity.Training;
import com.example.Training.Repository.TrainingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TrainingService {

    @Autowired
    private TrainingRepository trainingRepository;

    // ✅ Get All Trainings
    public List<Training> getAllTrainings() {
        return trainingRepository.findAll();
    }

    // ✅ Get Training by ID
    public Training getTrainingById(Long id) {
        return trainingRepository.findById(id).orElseThrow(() -> new RuntimeException("Training not found"));
    }

    // ✅ Add Training
    public Training addTraining(Training training) {
        return trainingRepository.save(training);
    }

    // ✅ Update Training
    public Training updateTraining(Long id, Training updatedTraining) {
        Training existingTraining = getTrainingById(id);
        existingTraining.setName(updatedTraining.getName());
        existingTraining.setSkills(updatedTraining.getSkills());
        existingTraining.setStartDate(updatedTraining.getStartDate());
        existingTraining.setEndDate(updatedTraining.getEndDate());
        existingTraining.setStatus(updatedTraining.getStatus());
        return trainingRepository.save(existingTraining);
    }

    // ✅ Delete Training
    public void deleteTraining(Long id) {
        trainingRepository.deleteById(id);
    }

    // ✅ Get Ongoing Trainings
    public List<Training> getOngoingTrainings() {
        return trainingRepository.findOngoingTrainings();
    }

    // ✅ Get Trainings by Skill
    public List<Training> getTrainingsBySkill(String skill) {
        return trainingRepository.findTrainingsBySkill(skill);
    }

    // ✅ Get Trainings Between Start and End Date
    public List<Training> getTrainingsBetweenDates(LocalDate startDate, LocalDate endDate) {
        return trainingRepository.findTrainingsBetweenDates(startDate, endDate);
    }

    // ✅ Get Trainings by Status
    public List<Training> getTrainingsByStatus(Training.TrainingStatus status) {
        return trainingRepository.findByStatus(status);
    }
}
