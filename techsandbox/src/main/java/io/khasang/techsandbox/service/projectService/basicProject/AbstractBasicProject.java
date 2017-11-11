package io.khasang.techsandbox.service.projectService.basicProject;

import io.khasang.techsandbox.service.projectService.AbstractProject;
import io.khasang.techsandbox.service.projectService.Status;

public abstract class AbstractBasicProject extends AbstractProject {
    private Status status = Status.PENDING;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
