package com.example.Training.Repository;

import com.example.Training.Entity.Training;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TrainingRepository extends JpaRepository<Training, Long> {

    // ✅ Find Ongoing Trainings
    @Query("SELECT t FROM Training t WHERE t.startDate <= CURRENT_DATE AND t.endDate >= CURRENT_DATE")
    List<Training> findOngoingTrainings();

    // ✅ Find Trainings by Skill
    @Query("SELECT t FROM Training t JOIN t.skills s WHERE s = :skill")
    List<Training> findTrainingsBySkill(@Param("skill") String skill);

    // ✅ Find Trainings Between Start and End Dates
    @Query("SELECT t FROM Training t WHERE t.startDate >= :startDate AND t.endDate <= :endDate")
    List<Training> findTrainingsBetweenDates(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);

    // ✅ Find Trainings by Status
    List<Training> findByStatus(Training.TrainingStatus status);
}
