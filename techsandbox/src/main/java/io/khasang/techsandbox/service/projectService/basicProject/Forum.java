package io.khasang.techsandbox.service.projectService.basicProject;

import java.math.BigDecimal;

public class Forum extends AbstractBasicProject {
    public Forum() {
        setTitle("Forum ");
        setDescription("Basic Forum website ");
        setPrice(new BigDecimal(70));
    }
}
