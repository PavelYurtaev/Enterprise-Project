package io.khasang.techsandbox.dao.interfaces;

import io.khasang.techsandbox.model.CustomerOrder;

import java.util.List;

public interface OrderDao {
    CustomerOrder findById(Integer id);

    List<CustomerOrder> findAll();

    void save(CustomerOrder customerOrder);

    void update(CustomerOrder order);

    List<CustomerOrder> findOrdersByProjectId(Integer projectId);

    void deleteAllOrders();
}
