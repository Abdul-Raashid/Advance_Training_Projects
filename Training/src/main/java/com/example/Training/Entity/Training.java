package com.example.Training.Entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "trainings")
public class Training {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 5)
    private String traineeId;

    @Column(nullable = false)
    private String name;

    @ElementCollection
    private List<String> skills;

    @Enumerated(EnumType.STRING)
    private DurationType duration;

    @Column(nullable = false)
    private LocalDate startDate;

    @Column(nullable = false)
    private LocalDate endDate;

    private int numberOfBatches;
    private long studentsPerBatch;
    private double budget;
    private String tableOfContent;
    private String organizationName;
    private String poc;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String phone;

    @Enumerated(EnumType.STRING)
    private StudentType studentType;

    @Enumerated(EnumType.STRING)
    private TrainingStatus status;

    // Enums
    public enum DurationType {
        HOURS, DAYS, MONTHS
    }

    public enum StudentType {
        FRESHER, LATERAL
    }

    public enum TrainingStatus {
        ON_HOLD, IN_PROGRESS, COMPLETED, UPCOMING
    }

    // ✅ Default Constructor
    public Training() {
    }

    // ✅ Parameterized Constructor
    public Training(String traineeId, String name, List<String> skills, DurationType duration,
                    LocalDate startDate, LocalDate endDate, int numberOfBatches,
                    long studentsPerBatch, double budget, String tableOfContent,
                    String organizationName, String poc, String email, String phone,
                    StudentType studentType, TrainingStatus status) {
        this.traineeId = traineeId;
        this.name = name;
        this.skills = skills;
        this.duration = duration;
        this.startDate = startDate;
        this.endDate = endDate;
        this.numberOfBatches = numberOfBatches;
        this.studentsPerBatch = studentsPerBatch;
        this.budget = budget;
        this.tableOfContent = tableOfContent;
        this.organizationName = organizationName;
        this.poc = poc;
        this.email = email;
        this.phone = phone;
        this.studentType = studentType;
        this.status = status;
    }

    // ✅ Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTraineeId() {
        return traineeId;
    }

    public void setTraineeId(String traineeId) {
        this.traineeId = traineeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public DurationType getDuration() {
        return duration;
    }

    public void setDuration(DurationType duration) {
        this.duration = duration;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getNumberOfBatches() {
        return numberOfBatches;
    }

    public void setNumberOfBatches(int numberOfBatches) {
        this.numberOfBatches = numberOfBatches;
    }

    public long getStudentsPerBatch() {
        return studentsPerBatch;
    }

    public void setStudentsPerBatch(long studentsPerBatch) {
        this.studentsPerBatch = studentsPerBatch;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public String getTableOfContent() {
        return tableOfContent;
    }

    public void setTableOfContent(String tableOfContent) {
        this.tableOfContent = tableOfContent;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getPoc() {
        return poc;
    }

    public void setPoc(String poc) {
        this.poc = poc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public StudentType getStudentType() {
        return studentType;
    }

    public void setStudentType(StudentType studentType) {
        this.studentType = studentType;
    }

    public TrainingStatus getStatus() {
        return status;
    }

    public void setStatus(TrainingStatus status) {
        this.status = status;
    }

    // ✅ toString() Method (for debugging)
    @Override
    public String toString() {
        return "Training{" +
                "id=" + id +
                ", traineeId='" + traineeId + '\'' +
                ", name='" + name + '\'' +
                ", skills=" + skills +
                ", duration=" + duration +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", numberOfBatches=" + numberOfBatches +
                ", studentsPerBatch=" + studentsPerBatch +
                ", budget=" + budget +
                ", tableOfContent='" + tableOfContent + '\'' +
                ", organizationName='" + organizationName + '\'' +
                ", poc='" + poc + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", studentType=" + studentType +
                ", status=" + status +
                '}';
    }
}
