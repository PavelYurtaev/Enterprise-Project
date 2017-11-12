package io.khasang.techsandbox.service.projectService.orderDecorator;

import io.khasang.techsandbox.service.projectService.ProjectInterface;

import java.math.BigDecimal;

public class PhotoGallery extends OrderDecorator {
    public PhotoGallery(ProjectInterface project) {
        this.project = project;
        setTitle(" Photo Gallery");
        setDescription(" Display your favourite photos in an online photo album.");
        setPrice(new BigDecimal(19));
    }
}
