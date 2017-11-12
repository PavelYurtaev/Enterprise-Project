package io.khasang.techsandbox.service.projectService.orderDecorator;

import io.khasang.techsandbox.service.projectService.ProjectInterface;

import java.math.BigDecimal;

public class WebsiteStatistic extends OrderDecorator {
    public WebsiteStatistic(ProjectInterface project) {
        this.project = project;
        setTitle(" Website Statistic");
        setDescription(" Learn everything you need to know about your site's visitors.");
        setPrice(new BigDecimal(10));
    }
}
