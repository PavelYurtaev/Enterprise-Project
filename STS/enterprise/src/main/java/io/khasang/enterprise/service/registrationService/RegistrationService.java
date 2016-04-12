package io.khasang.enterprise.service.registrationService;

import io.khasang.enterprise.dao.interfaces.ClientDao;
import io.khasang.enterprise.dao.interfaces.EmployeeDao;
import io.khasang.enterprise.model.Client;
import io.khasang.enterprise.model.Employee;
import io.khasang.enterprise.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RegistrationService {

    @Autowired
    private ClientDao clientDao;
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private AdminService adminService;

    @Transactional
    public void saveClientToDB(Client client) {
        clientDao.saveClient(client);
        adminService.addClientRole(client.getId());
    }

    @Transactional
    public boolean isLoginExist(String login) {
       if (clientDao.findByLogin(login) == null && employeeDao.findByLogin(login) == null) return false;
       else return true;
    }

    @Transactional
    public void saveEmployeeinDB(Employee employee) {
        employeeDao.saveEmployee(employee);
        adminService.addEmployeeRole(employee.getId());
    }
}