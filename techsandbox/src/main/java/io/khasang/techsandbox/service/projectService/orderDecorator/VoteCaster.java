package io.khasang.techsandbox.service.projectService.orderDecorator;

import io.khasang.techsandbox.service.projectService.ProjectInterface;

import java.math.BigDecimal;

public class VoteCaster extends OrderDecorator {
    public VoteCaster(ProjectInterface project) {
        this.project = project;
        setTitle(" Vote Caster");
        setDescription(" Set up surveys, quizzes, and polls in just a few minutes.");
        setPrice(new BigDecimal(25));
    }
}
