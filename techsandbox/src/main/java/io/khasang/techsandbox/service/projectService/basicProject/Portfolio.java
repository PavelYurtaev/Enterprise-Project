package io.khasang.techsandbox.service.projectService.basicProject;

import java.math.BigDecimal;

public class Portfolio extends AbstractBasicProject {
    public Portfolio() {
        setTitle("Portfolio ");
        setDescription("Basic Portfolio website ");
        setPrice(new BigDecimal(60));
    }
}
