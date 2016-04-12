package io.khasang.enterprise.service;

import io.khasang.enterprise.dao.interfaces.ClientDao;
import io.khasang.enterprise.dao.interfaces.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("adminService")
@Transactional
public class AdminService {
    @Autowired
    private ClientDao clientDao;
    @Autowired
    private EmployeeDao employeeDao;

    @Transactional
    public void addClientRole(int id) {
        clientDao.addClientRole(id);
    }

    @Transactional
    public void deleteClientById(int id) {
        deleteClientRoleById(id);
        clientDao.deleteClientById(id);
    }

    @Transactional
    private void deleteClientRoleById(int id) {
        clientDao.deleteClientRoleById(id);
    }

    @Transactional
    public void deleteAllClients() {
        deleteAllClientRoles();
        clientDao.deleteAllClients();
    }

    @Transactional
    private void deleteAllClientRoles() {
        clientDao.deleteAllClientRoles();
    }

    /**Employee*/
    @Transactional
    public void addEmployeeRole(int id) {
        employeeDao.addEmployeeRole(id);
    }

    @Transactional
    public void deleteEmployeeById(int id) {
        deleteEmployeeRoleById(id);
        employeeDao.deleteEmployeeById(id);
    }

    @Transactional
    private void deleteEmployeeRoleById(int id) {
        employeeDao.deleteEmployeeRoleById(id);
    }

    @Transactional
    public void deleteAllEmployees() {
        deleteAllEmployersRoles();
        employeeDao.deleteAllEmployees();
    }

    @Transactional
    private void deleteAllEmployersRoles() {
        employeeDao.deleteAllEmployersRoles();
    }
}