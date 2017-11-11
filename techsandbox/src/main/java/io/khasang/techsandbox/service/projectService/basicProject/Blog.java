package io.khasang.techsandbox.service.projectService.basicProject;

import java.math.BigDecimal;

public class Blog extends AbstractBasicProject {
    public Blog() {
        setTitle("Blog ");
        setDescription("Basic Blog website ");
        setPrice(new BigDecimal(100));
    }
}
