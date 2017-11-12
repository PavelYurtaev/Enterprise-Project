package io.khasang.techsandbox.dao;

import io.khasang.techsandbox.dao.interfaces.OrderDao;
import io.khasang.techsandbox.model.CustomerOrder;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("orderDao")
public class OrderDaoImpl extends AbstractDao<Integer, CustomerOrder> implements OrderDao {

    @SuppressWarnings("unchecked")
    public List<CustomerOrder> findOrdersByProjectId(Integer projectId) {
        Query query = getSession().createQuery("FROM CustomerOrder u WHERE u.project = :project");
        query.setInteger("project", projectId);
        return query.list();
    }

    public void deleteAllOrders() {
        Query query = getSession().createSQLQuery("delete from customer_order");
        query.executeUpdate();
    }
}