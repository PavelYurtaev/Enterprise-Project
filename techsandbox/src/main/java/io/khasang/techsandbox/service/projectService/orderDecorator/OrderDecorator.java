package io.khasang.techsandbox.service.projectService.orderDecorator;

import io.khasang.techsandbox.service.projectService.AbstractProject;
import io.khasang.techsandbox.service.projectService.ProjectInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

public abstract class OrderDecorator extends AbstractProject {
    ProjectInterface project;

    public String getTitle(){
        return project.getTitle()+ super.getTitle();
    }

    public String getDescription() {
        return project.getDescription()+ super.getDescription();
    }

    public BigDecimal getPrice(){
        return project.getPrice().add(super.getPrice());
    }
}
